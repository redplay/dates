/*
 * Copyright (C) 2017 RedPlay.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.redplay.dates;

import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    private static volatile Dates singleton = null;
    private final Context context;
    private String mdate = "";
    private String mtime = "";

    private Dates(Context context) {
        this.context = context;
    }


    public static Dates with(Context context) {
        if (singleton == null) {
            synchronized (Dates.class) {
                if (singleton == null) {
                    singleton = new Builder(context).build();
                }
            }
        }
        return singleton;
    }

    public Dates date(String mdate) {
        this.mdate = mdate.trim();
        return this;
    }

    public Dates time(String mtime) {
        this.mtime = mtime.trim();
        return this;
    }

    public String format(Format format) {

        if (format.strictCase.equals(FormatConstants.STRICT_DATE)) {
            if (!mdate.isEmpty()) {
                if (validate(mdate, FormatConstants.DATE)) {
                    if (mtime.isEmpty()) {
                        return doFormattingWith(format.typeKey, FormatConstants.DATE_FORMAT);
                    } else {
                        if (validate(mtime, FormatConstants.TIME)) {
                            return doFormattingWith(format.typeKey, FormatConstants.DATE_FORMAT);
                        } else {
                            throw new IllegalArgumentException(FormatConstants.TIME_FORMAT_EXCEPTION);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(FormatConstants.DATE_FORMAT_EXCEPTION);
                }
            } else {
                throw new IllegalArgumentException(FormatConstants.STRICT_DATE_EXCEPTION);
            }
        } else if (format.strictCase.equals(FormatConstants.STRICT_TIME)) {
            if (!mtime.isEmpty()) {
                if (validate(mtime, FormatConstants.TIME)) {
                    if (mdate.isEmpty()) {
                        mdate = "";
                        return doFormattingWith(format.typeKey, FormatConstants.TIME_FORMAT);
                    } else {
                        if (validate(mdate, FormatConstants.DATE)) {
                            mdate = "";
                            return doFormattingWith(format.typeKey, FormatConstants.TIME_FORMAT);
                        } else {
                            throw new IllegalArgumentException(FormatConstants.DATE_FORMAT_EXCEPTION);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(FormatConstants.TIME_FORMAT_EXCEPTION);
                }
            } else {
                throw new IllegalArgumentException(FormatConstants.STRICT_TIME_EXCEPTION);
            }
        } else if (format.strictCase.equals(FormatConstants.STRICT_BOTH)) {
            if (!mdate.isEmpty() && !mtime.isEmpty()) {
                if (validate(mdate, FormatConstants.DATE)) {
                    if (validate(mtime, FormatConstants.TIME)) {
                        return doFormattingWith(format.typeKey, FormatConstants.STANDARD_FORMAT);
                    } else {
                        throw new IllegalArgumentException(FormatConstants.TIME_FORMAT_EXCEPTION);
                    }
                } else {
                    throw new IllegalArgumentException(FormatConstants.DATE_FORMAT_EXCEPTION);
                }
            } else {
                throw new IllegalArgumentException(FormatConstants.STRICT_BOTH_EXCEPTION);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean validate(String inValue, int type) {
        SimpleDateFormat format;
        switch (type) {
            case 1:
                format = new SimpleDateFormat(FormatConstants.DATE_FORMAT);
                break;
            case 2:
                format = new SimpleDateFormat(FormatConstants.TIME_FORMAT);
                break;
            default:
                format = null;

        }
        if (format != null) {
            format.setLenient(false);
        }
        try {
            if (format != null) {
                format.parse(inValue.trim());
            }
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    private String doFormattingWith(String formatType, String standardType) {
        String afterFormatting = "";
        String datetime = mdate + " " + mtime;
        SimpleDateFormat standardFormat = new SimpleDateFormat(standardType);
        standardFormat.setLenient(false);
        SimpleDateFormat DatesFormat;

        if (formatType.contains(FormatConstants.SUFFIX)) {
            DatesFormat = new SimpleDateFormat(addOrdinal(formatType));
        } else {
            DatesFormat = new SimpleDateFormat(formatType);
        }

        try {
            Date standardDate = (standardFormat.parse(datetime));
            if (formatType.equals(FormatConstants.TYPE29_FORMAT)) {
                String formattedType29 = DatesFormat.format(standardDate);
                String[] type29Array = formattedType29.split("\\s+");
                String weekOrdinal = getDayOrdinal(Integer.parseInt(type29Array[0]));
                afterFormatting = formattedType29.replace(type29Array[0], type29Array[0] + weekOrdinal);
            } else if (formatType.equals(FormatConstants.TYPE30_FORMAT)) {
                String formattedType30 = DatesFormat.format(standardDate);
                String[] type30Array = formattedType30.split("\\s+");
                String dayOrdinal = getDayOrdinal(Integer.parseInt(type30Array[0]));
                afterFormatting = formattedType30.replace(type30Array[0], type30Array[0] + dayOrdinal);
            } else if (formatType.equals(FormatConstants.TYPE31_FORMAT)) {
                String formattedType31 = DatesFormat.format(standardDate);
                String[] type31Array = formattedType31.split("\\s+");
                String weekOrdinal = getDayOrdinal(Integer.parseInt(type31Array[0]));
                afterFormatting = formattedType31.replace(type31Array[0], type31Array[0] + weekOrdinal);
            } else {
                afterFormatting = DatesFormat.format(standardDate);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        mdate = "";
        mtime = "";

        return afterFormatting;
    }

    private String addOrdinal(String formatType) {

        String formattedType = "";
        String[] fulldate = mdate.split("-");
        String dayOrdinal = getDayOrdinal(Integer.parseInt(fulldate[2]));
        formattedType = formatType.replace(FormatConstants.SUFFIX, "'" + dayOrdinal + "'");

        return formattedType;
    }

    private String getDayOrdinal(int day) {
        int hundredRemainder = day % 100;
        int tenRemainder = day % 10;
        if (hundredRemainder - tenRemainder == 10) {
            return "th";
        }
        switch (tenRemainder) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    private static class Builder {

        private final Context context;

        private Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.context = context.getApplicationContext();
        }

        private Dates build() {
            Context context = this.context;
            return new Dates(context);
        }
    }
}
