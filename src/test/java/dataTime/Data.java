package dataTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

    public static void main(String[] args) {
        Data firstData = new Data();
        Data secondData = new Data();

        System.out.println(firstData.equals(secondData));
        System.out.println(firstData.getClass());

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar); //a lot of fields
        System.out.println(calendar.getTime()); //only time
        System.out.println(calendar.getTimeZone());

        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 42);

        System.out.println("Calendar after setting time " + calendar.getTime());

        Calendar calendarTimeCurrent = new GregorianCalendar();
        System.out.println(calendarTimeCurrent.getTime());
        System.out.println(calendarTimeCurrent.after(calendar));

        System.out.println("Change calendarTimeCurrent");
        calendarTimeCurrent.add(Calendar.MONTH, -2);// change data (pay attention 'add' not 'set')
        System.out.println("Calendar time after changing " + calendarTimeCurrent.getTime());

        String patternDate = "dd-MM-yyyy";
        SimpleDateFormat format = new SimpleDateFormat(patternDate);

        System.out.println(format.format(calendarTimeCurrent.getTime()));

        String secondPatternDate = "MM-dd-yy";
        SimpleDateFormat secondFormat = new SimpleDateFormat(secondPatternDate);
        System.out.println(secondFormat.format(calendarTimeCurrent.getTime()));
    }
}
