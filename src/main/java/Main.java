import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        printDate();
    }

    private static void printDate() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();

        System.out.println(String.format("Current date is: %s", date));
    }
}
