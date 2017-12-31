package com.zhifei.test.rilixuanzeqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Calendar cal;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        //获取日历一个对象
        cal = Calendar.getInstance();
        //获取年月日时分秒的信息

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH)+1;//获取当前月份+1处理



    }
}
