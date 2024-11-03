import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Бир жуманын кунун жаз");
        String input = scanner.nextLine();

        switch (input) {
            case "Monday":
                System.out.println(DaysOfWeek.MONDAY.schedule);
                break;
            case "Tuesday":
                System.out.println(DaysOfWeek.TUESDAY.schedule);
                break;
            case "Wednesday":
                System.out.println(DaysOfWeek.WEDNESDAY.schedule);
                break;
            case "Thursday":
                System.out.println(DaysOfWeek.THURSDAY.schedule);
                break;
            case "Friday":
                System.out.println(DaysOfWeek.FRIDAY.schedule);
                break;

        }

}}
