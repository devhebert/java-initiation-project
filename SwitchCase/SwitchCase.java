package SwitchCase;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Day of the week: Sunday");
                break;
            case 2:
                System.out.println("Day of the week: Monday");
                break;
            case 3:
                System.out.println("Day of the week: Tuesday");
                break;
            case 4:
                System.out.println("Day of the week: Wednesday");
                break;
            case 5:
                System.out.println("Day of the week: Thursday");
                break;
            case 6:
                System.out.println("Day of the week: Friday");
                break;
            case 7:
                System.out.println("Day of the week: Saturday");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }

        scanner.close();
    }
}