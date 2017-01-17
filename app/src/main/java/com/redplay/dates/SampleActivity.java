package com.redplay.dates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.redplay.Dates;
import com.github.redplay.Format;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        TextView tv_Type1 = (TextView) findViewById(R.id.tv_Type1);
        TextView tv_Type2 = (TextView) findViewById(R.id.tv_Type2);
        TextView tv_Type3 = (TextView) findViewById(R.id.tv_Type3);
        TextView tv_Type4 = (TextView) findViewById(R.id.tv_Type4);
        TextView tv_Type5 = (TextView) findViewById(R.id.tv_Type5);
        TextView tv_Type6 = (TextView) findViewById(R.id.tv_Type6);
        TextView tv_Type7 = (TextView) findViewById(R.id.tv_Type7);
        TextView tv_Type8 = (TextView) findViewById(R.id.tv_Type8);
        TextView tv_Type9 = (TextView) findViewById(R.id.tv_Type9);
        TextView tv_Type10 = (TextView) findViewById(R.id.tv_Type10);
        TextView tv_Type11 = (TextView) findViewById(R.id.tv_Type11);
        TextView tv_Type12 = (TextView) findViewById(R.id.tv_Type12);
        TextView tv_Type13 = (TextView) findViewById(R.id.tv_Type13);
        TextView tv_Type14 = (TextView) findViewById(R.id.tv_Type14);
        TextView tv_Type15 = (TextView) findViewById(R.id.tv_Type15);
        TextView tv_Type16 = (TextView) findViewById(R.id.tv_Type16);
        TextView tv_Type17 = (TextView) findViewById(R.id.tv_Type17);
        TextView tv_Type18 = (TextView) findViewById(R.id.tv_Type18);
        TextView tv_Type19 = (TextView) findViewById(R.id.tv_Type19);
        TextView tv_Type20 = (TextView) findViewById(R.id.tv_Type20);
        TextView tv_Type21 = (TextView) findViewById(R.id.tv_Type21);
        TextView tv_Type22 = (TextView) findViewById(R.id.tv_Type22);
        TextView tv_Type23 = (TextView) findViewById(R.id.tv_Type23);
        TextView tv_Type24 = (TextView) findViewById(R.id.tv_Type24);
        TextView tv_Type25 = (TextView) findViewById(R.id.tv_Type25);
        TextView tv_Type26 = (TextView) findViewById(R.id.tv_Type26);
        TextView tv_Type27 = (TextView) findViewById(R.id.tv_Type27);
        TextView tv_Type28 = (TextView) findViewById(R.id.tv_Type28);
        TextView tv_Type29 = (TextView) findViewById(R.id.tv_Type29);
        TextView tv_Type30 = (TextView) findViewById(R.id.tv_Type30);
        TextView tv_Type31 = (TextView) findViewById(R.id.tv_Type31);

        /* Simple use cases */
        tv_Type1.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE1));
        tv_Type2.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE2));
        tv_Type3.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE3));
        tv_Type4.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE4));
        tv_Type5.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE5));
        tv_Type6.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE6));
        tv_Type7.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE7));
        tv_Type8.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE8));
        tv_Type9.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE9));
        tv_Type10.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE10));
        tv_Type11.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE11));
        tv_Type12.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE12));
        tv_Type13.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE13));
        tv_Type14.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE14));
        tv_Type15.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE15));
        tv_Type16.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE16));
        tv_Type17.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE17));
        tv_Type18.setText(Dates.with(this).time("20:45:50").format(Format.TYPE18));
        tv_Type19.setText(Dates.with(this).time("20:45:50").format(Format.TYPE19));
        tv_Type20.setText(Dates.with(this).time("20:45:50").format(Format.TYPE20));
        tv_Type21.setText(Dates.with(this).time("20:45:50").format(Format.TYPE21));
        tv_Type22.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE22));
        tv_Type23.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE23));
        tv_Type24.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE24));
        tv_Type25.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE25));
        tv_Type26.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE26));
        tv_Type27.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE27));
        tv_Type28.setText(Dates.with(this).date("1990-07-23").time("20:45:50").format(Format.TYPE28));
        tv_Type29.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE29));
        tv_Type30.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE30));
        tv_Type31.setText(Dates.with(this).date("1989-06-06").format(Format.TYPE31));

    }
}
