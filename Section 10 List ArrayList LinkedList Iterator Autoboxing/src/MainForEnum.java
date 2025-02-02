import java.util.Random;

public class MainForEnum {
    public static void main(String[] args) {
        DayOfTheWeek weekDay=DayOfTheWeek.SUN;
        System.out.println(weekDay);
        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(),weekDay.ordinal());
        System.out.println(getRandomDay());
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger=new Random().nextInt(7);

        var allDays=DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
