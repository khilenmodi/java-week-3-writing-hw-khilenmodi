package homework_week_7;

import java.util.Scanner;

/**
 * write a java program which input any number between 1 to 7 and it print the days
 * name MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY AND SUNDAY of the week accordingly by using switch
 * note: if number is out of selection print message "week contain 1 to 7 days"
 */

public class Programme_13_FindTheDayName {

    // finding the name of the day
    public static void findtheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("it is Monday");
                break;
            case 2:
                System.out.println("it is Tuesday");
                break;
            case 3:
                System.out.println("it is Wednesday");
                break;
            case 4:
                System.out.println("it is Thursday");
                break;
            case 5:
                System.out.println("it is Friday");
                break;
            case 6:
                System.out.println("it is Saturday");
                break;
            case 7:
                System.out.println("it is Sunday");
                break;
            default:
                System.out.println("week contain 1 to 7 days ");
        }
    }

    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a valid number between 1 to 7 :");
        int day = scanner.nextInt();
        findtheDaysName(day);
        // closing the scanner object
        scanner.close();
    }
}
