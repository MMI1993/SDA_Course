package main.java.current_date;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_date {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("HH");
        SimpleDateFormat sdf1=new SimpleDateFormat("MMMM");
        SimpleDateFormat sdf2= new SimpleDateFormat("ss");
        System.out.println("seconds in ss format : " + sdf2.format(date));
        System.out.println("hour in h format : " + sdf.format (date));
        System.out.println("current Month in MMMM format : " + sdf1.format(date));

        String strDateFormat= "HH : mm:ss a";
        SimpleDateFormat sdfCustom= new SimpleDateFormat(strDateFormat);
        System.out.println(sdfCustom.format(date));
    }
}
