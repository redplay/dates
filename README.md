# Dates

[Dates][1] allows its users to customize date and time formatting in your Android application often in one line of code!

```javascript
Dates.with(context).date("1990-07-23").time("20:45:50").format(Format.TYPE1);
```

## Download

Grab via Gradle:

```groovy
compile 'com.github.redplay:dates:1.0.0'
```

or Maven:

```xml
<dependency>
  <groupId>com.github.redplay</groupId>
  <artifactId>dates</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## Usage

[Dates][1] is provided with 31 custom formats as listed below:

Format.TYPE  | Custom date/time  
------------ | ---------------------------------------
TYPE1        | 06-Jun-89
TYPE2        | 06 June 1989
TYPE3        | 6th June 1989
TYPE4        | June, 1989
TYPE5        | June 6th
TYPE6        | July 23rd at 08:45 PM
TYPE7        | July 23rd at 20:45 hrs
TYPE8        | July 23rd, 1990 at 08:45 PM
TYPE9        | July 23rd, 1990 at 20:45 hrs
TYPE10       | July 23, 1990 8:45:50 PM GMT+05:30
TYPE11       | Jul 23, 1990 8:45 PM
TYPE12       | Jul 23, 1990 8:45:50 PM
TYPE13       | Monday, July 23, 1990
TYPE14       | Monday, July 23, 1990 8:45 PM
TYPE15       | Monday, July 23, 1990 8:45:50 PM
TYPE16       | Mon, Jul 23, '90
TYPE17       | Mon Jul 23 20:45:50 GMT+05:30 1990
TYPE18       | 8 o'clock PM
TYPE19       | 20:45 hrs
TYPE20       | 8:45 PM
TYPE21       | 8:45:50 PM
TYPE22       | 6/06/1989
TYPE23       | 7/23/1990 8:45 PM
TYPE24       | 7/23/1990 8:45:50 PM
TYPE25       | 06/06/89
TYPE26       | 23/07/90 at 8:45 PM
TYPE27       | 23/Jul/1990 - 20:45 hrs
TYPE28       | 1990.07.23 AD at 20:45:50 GMT+05:30
TYPE29       | 2nd week of June, 1989
TYPE30       | 157th day of 1989
TYPE31       | 23rd week of 1989               

All you need to do is, simply add **date/time** or **both** along with a selected **Format.TYPE**.

**Simple use cases:**

```javascript
TextView textView = (TextView) findViewById(R.id.textview);
EditText editText = (EditText) findViewById(R.id.edittext);

/* To display custom date */
textView.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE1));

/* To get a custom time */
String customTime = Dates.with(this).time("20:45:50").format(Format.TYPE18); 

/* To set a custom date and time */
editText.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE10));
```

## License

    Copyright (C) 2017 RedPlay.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
         http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
 [1]: https://redplay.github.io/dates/
