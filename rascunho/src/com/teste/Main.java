package com.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Date inicioHora = parse("09:20", "HH:mm");
        Date fimData  = parse("2021-08-25", "yyyy-MM-dd");

        String dateInicio = format(fimData, "yyyy-MM-dd") + " " + format(inicioHora, "HH:mm");
        System.out.println(format(inicioHora, "HH:mm"));
        System.out.println(format(fimData, "yyyy-MM-dd"));
        System.out.println(parse(dateInicio,"yyyy-MM-dd HH:mm"));
    }

    public static Date parse(String dateParse, String pattern) throws ParseException {
        var dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.parse(dateParse);
    }

    public static String format(Date date, String pattern) {
        var dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }
}
