package com.benjamin.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static DateFormat Y_M_D = new SimpleDateFormat("yyyy-MM-dd");

    public static Date dateStrToDate(String dateStr) {

        try {
            Date date = Y_M_D.parse(dateStr);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Date();
    }
}
