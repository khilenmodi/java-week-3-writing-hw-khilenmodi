package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if the enter number is "POSITIVE", "NEGATIVE" or "ZERO"
 */

public class Programme_16_FindPositiveNegative {

            // finding the number is positive, negative or zero
        public static void findNumberIsPositiveNegativeOrZero(int  number){
            if (number> 0){
                System.out.println(number + " Is a Positive Number");
            }else if (number<0){
                System.out.println(number + " Is a Negative Number");
            }else{
                System.out.println(number + " Is a Zero Number ");
            }
        }

    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // closing the scanner object ]
        scanner.close();
    }
}
