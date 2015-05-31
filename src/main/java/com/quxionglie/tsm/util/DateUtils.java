package com.quxionglie.tsm.util;

import com.google.common.base.Strings;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

public class DateUtils implements java.io.Serializable {
    private static final long serialVersionUID = 8871503471488284277L;

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static Date parse(String dateStr, String dateFormat) {
        if (Strings.isNullOrEmpty(dateStr)) {
            return null;
        }
        DateTime dataTime = DateTimeFormat.forPattern(dateFormat).parseDateTime(dateStr);
        return dataTime.toDate();
    }

    public static String format(Date date, String dateFormat) {
        if (date == null) {
            return null;
        }
        DateTime dataTime = new DateTime(date);
        return dataTime.toString(dateFormat);
    }

    public static String now() {
        return new DateTime().toString(DATE_TIME_FORMAT);
    }

    public static String format(Date date) {
        return format(date, DATE_TIME_FORMAT);
    }

    public static String format(long timeMillis) {
        return new DateTime(timeMillis).toString(DATE_TIME_FORMAT);
    }
}
