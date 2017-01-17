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
package com.github.redplay;

public enum Format {

    TYPE1(FormatConstants.TYPE1_FORMAT, FormatConstants.STRICT_DATE),
    TYPE2(FormatConstants.TYPE2_FORMAT, FormatConstants.STRICT_DATE),
    TYPE3(FormatConstants.TYPE3_FORMAT, FormatConstants.STRICT_DATE),
    TYPE4(FormatConstants.TYPE4_FORMAT, FormatConstants.STRICT_DATE),
    TYPE5(FormatConstants.TYPE5_FORMAT, FormatConstants.STRICT_DATE),
    TYPE6(FormatConstants.TYPE6_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE7(FormatConstants.TYPE7_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE8(FormatConstants.TYPE8_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE9(FormatConstants.TYPE9_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE10(FormatConstants.TYPE10_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE11(FormatConstants.TYPE11_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE12(FormatConstants.TYPE12_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE13(FormatConstants.TYPE13_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE14(FormatConstants.TYPE14_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE15(FormatConstants.TYPE15_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE16(FormatConstants.TYPE16_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE17(FormatConstants.TYPE17_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE18(FormatConstants.TYPE18_FORMAT, FormatConstants.STRICT_TIME),
    TYPE19(FormatConstants.TYPE19_FORMAT, FormatConstants.STRICT_TIME),
    TYPE20(FormatConstants.TYPE20_FORMAT, FormatConstants.STRICT_TIME),
    TYPE21(FormatConstants.TYPE21_FORMAT, FormatConstants.STRICT_TIME),
    TYPE22(FormatConstants.TYPE22_FORMAT, FormatConstants.STRICT_DATE),
    TYPE23(FormatConstants.TYPE23_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE24(FormatConstants.TYPE24_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE25(FormatConstants.TYPE25_FORMAT, FormatConstants.STRICT_DATE),
    TYPE26(FormatConstants.TYPE26_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE27(FormatConstants.TYPE27_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE28(FormatConstants.TYPE28_FORMAT, FormatConstants.STRICT_BOTH),
    TYPE29(FormatConstants.TYPE29_FORMAT, FormatConstants.STRICT_DATE),
    TYPE30(FormatConstants.TYPE30_FORMAT, FormatConstants.STRICT_DATE),
    TYPE31(FormatConstants.TYPE31_FORMAT, FormatConstants.STRICT_DATE);

    String typeKey;
    String strictCase;

    Format(String typeKey, String strictCase) {
        this.typeKey = typeKey;
        this.strictCase = strictCase;
    }

}

