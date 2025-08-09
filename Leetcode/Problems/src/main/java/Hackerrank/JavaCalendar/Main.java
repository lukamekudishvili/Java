package Hackerrank.JavaCalendar;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String[] date=scanner.nextLine().split(" ");
        int month=Integer.parseInt(date[0]);
        int day=Integer.parseInt(date[1]);
        int year=Integer.parseInt(date[2]);
        System.out.println(findDay(month,day,year));
    }

    private static String findDay(int month, int day, int year){
        Calendar calendar=Calendar.getInstance();
        calendar.set(year, month-1,day);

        int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = { "", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

        return days[dayOfWeek];

    }

}
