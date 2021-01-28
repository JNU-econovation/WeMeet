package com.example.wemeet;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.time.LocalDate;
import java.util.ArrayList;

public class DateData extends Thread {
    ArrayList<String> strdate;


    public DateData(ArrayList<String> strdate) {
        this.strdate = strdate;
    }

   @RequiresApi(api = Build.VERSION_CODES.O)

   public ArrayList<CalendarDay> CalendardateChange () {
        ArrayList<CalendarDay> eventdate = new ArrayList<>();

        for(int i=0; i<strdate.size(); i++){
            LocalDate localDate = LocalDate.parse(strdate.get(i));
            int year = localDate.getYear();
            int month = localDate.getMonthValue() ;
            int day = localDate.getDayOfMonth();
            CalendarDay date = CalendarDay.from(year,month,day);
            eventdate.add(i,date);
        }
        return eventdate;
    }
}
