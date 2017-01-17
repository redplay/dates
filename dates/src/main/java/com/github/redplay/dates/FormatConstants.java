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

class FormatConstants {

    /*  DATE FORMATS */
    /*06-Jun-89*/
    static final String TYPE1_FORMAT = "dd'-'MMM'-'yy";
    /*06 June 1989*/
    static final String TYPE2_FORMAT = "dd MMMM yyyy";
    /*6th June 1989*/
    static final String TYPE3_FORMAT = "dX MMMM yyyy";
    /*June, 1989*/
    static final String TYPE4_FORMAT = "MMMM, yyyy";
    /*June 6th*/
    static final String TYPE5_FORMAT = "MMMM dX";
    /*June 6th at 01:45 PM*/
    static final String TYPE6_FORMAT = "MMMM dX 'at' hh:mm a";
    /*June 6th at 13:45 hrs*/
    static final String TYPE7_FORMAT = "MMMM dX 'at' HH:mm 'hrs'";
    /*June 6th, 1989 at 01:45 PM*/
    static final String TYPE8_FORMAT = "MMMM dX, yyyy 'at' hh:mm a";
    /*June 6th, 1989 at 13:45 hrs*/
    static final String TYPE9_FORMAT = "MMMM dX, yyyy 'at' HH:mm 'hrs'";
    /*June 06, 1989 01:45:11 PM EST*/
    static final String TYPE10_FORMAT = "MMMM dd, yyyy h:mm:ss a z";
    /*Jun 06, 1989 01:45 PM*/
    static final String TYPE11_FORMAT = "MMM dd, yyyy h:mm a";
    /*Jun 06, 1989 01:45:11 PM*/
    static final String TYPE12_FORMAT = "MMM dd, yyyy h:mm:ss a";
    /*Tuesday, June 06, 1989*/
    static final String TYPE13_FORMAT = "EEEE, MMMM dd, yyyy";
    /*Tuesday, June 6, 1989 1:45 PM*/
    static final String TYPE14_FORMAT = "EEEE, MMMM d, yyyy h:mm a";
    /*Tuesday, June 6, 1989 1:45:11 PM*/
    static final String TYPE15_FORMAT = "EEEE, MMMM d, yyyy h:mm:ss a";
    /*Tue, Jun 6, '89*/
    static final String TYPE16_FORMAT = "EEE, MMM d, ''yy";
    /*Tue Jun 06 13:45:11 EST 1989*/
    static final String TYPE17_FORMAT = "EEE MMM dd HH:mm:ss z yyyy";
    /*12 o'clock PM*/
    static final String TYPE18_FORMAT = "h 'o''clock' a";
    /*13:45 hrs*/
    static final String TYPE19_FORMAT = "HH:mm 'hrs'";
    /*1:45 PM*/
    static final String TYPE20_FORMAT = "h:mm a";
    /*1:45:11 PM*/
    static final String TYPE21_FORMAT = "h:mm:ss a";
    /*6/15/2009*/
    static final String TYPE22_FORMAT = "M/dd/yyyy";
    /*6/15/2009 1:45 PM*/
    static final String TYPE23_FORMAT = "M/dd/yyyy h:mm a";
    /*6/15/2009 1:45:30 PM*/
    static final String TYPE24_FORMAT = "M/dd/yyyy h:mm:ss a";
    /*15/06/09*/
    static final String TYPE25_FORMAT = "dd/MM/yy";
    /*15/06/09 at 1:45 PM*/
    static final String TYPE26_FORMAT = "dd/MM/yy 'at' h:mm a";
    /*15/Jun/2009 - 13:45 hrs*/
    static final String TYPE27_FORMAT = "dd/MMM/yyyy '-' HH:mm 'hrs'";
    /*2001.07.04 AD at 12:08:56 PDT*/
    static final String TYPE28_FORMAT = "yyyy.MM.dd GG 'at' HH:mm:ss z";
    /*3rd week of June, 2009*/
    static final String TYPE29_FORMAT = "W 'week of' MMMM, yyyy";
    /*345th day of 2009*/
    static final String TYPE30_FORMAT = "D 'day of' yyyy";
    /*45th week of 2009*/
    static final String TYPE31_FORMAT = "w 'week of' yyyy";

    /* CONSTANTS */
    static final int DATE = 1;
    static final int TIME = 2;
    static final String SUFFIX = "X";
    static final String DATE_FORMAT = "yyyy-MM-dd";
    static final String TIME_FORMAT = "HH:mm:ss";
    static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
    static final String STRICT_DATE = "Strict date";
    static final String STRICT_TIME = "Strict time";
    static final String STRICT_BOTH = "Strict both";
    static final String STRICT_DATE_EXCEPTION = "Date missing! The opted format type requires a valid date.";
    static final String STRICT_TIME_EXCEPTION = "Time missing! The opted format type requires a valid time.";
    static final String STRICT_BOTH_EXCEPTION = "Date/Time missing! The opted format type requires both valid date & time.";
    static final String DATE_FORMAT_EXCEPTION = "Invalid date! The date format should be [yyyy-MM-dd] eg: 1989-06-06.";
    static final String TIME_FORMAT_EXCEPTION = "Invalid time! The time format should be [HH-mm-ss] eg: 13:45:00.";

}
