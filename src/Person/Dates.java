package Person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
	public static Date createDate(int month, int day, int year) {
        checkValueForDate(month, day, year);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }

    public static void checkValueForDate(int month, int day, int year) throws IllegalArgumentException {
        if (month > 12 || month < 1) {
            throw new IllegalArgumentException("Invalid value of month!");
        }
        if (day > 31 || day < 1) {
            throw new IllegalArgumentException("Invalid value of day!");
        }
        if (year > 2013 || year < 1) {
            throw new IllegalArgumentException("Invalid value of year!");
        }
    }

}
