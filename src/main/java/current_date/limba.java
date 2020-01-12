package main.java.current_date;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.Locale;

public class limba {
    public static void main(String[] args) {
        Date d1= new Date();
        System.out.println("today is " + d1.toString());
        Locale locItalian = new Locale("it", "ch");
        DateFormat df= DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian language " + "in Switzerland Format : " + df.format(d1));
        Locale locItalianFull= new Locale ("it");
        DateFormat dfFULL=DateFormat.getDateInstance(DateFormat.FULL,locItalianFull);
        System.out.println("today is " + dfFULL.format(d1));

    }
}
