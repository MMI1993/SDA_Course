package main.java.current_date;

import java.text.DateFormatSymbols;

public class Day_week {
    public static void main(String[] args) {
        String[] shortMonths=new DateFormatSymbols().getShortMonths();
        for(int i=0;i<(shortMonths.length-1);i++){
            String shortMonth=shortMonths[i];
            System.out.println("shortMonth = "+shortMonth);
        }
        System.out.println("___");
        String[] weekdays =new DateFormatSymbols().getWeekdays();
        for(int i=1;i<(weekdays.length);i++){
            String weekday=weekdays[i];
            System.out.println("weekday = "+weekday);
        }
    }
}

