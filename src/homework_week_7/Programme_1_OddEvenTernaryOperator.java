package homework_week_7;

import java.util.Scanner;

/**
 *  Write a java program that tells us that Input number is odd or even?
 *  Hint : use ternary operator(? :)
 */
public class Programme_1_OddEvenTernaryOperator {

            public static void main(String[] args){
                // scanner declaration for reading input from console
                Scanner scanner = new Scanner (System.in);
                System.out.println("please enter the number :");
                int number = scanner.nextInt();
                isItOddorEvenNumber (number);
                // closing the scanner object
                scanner.close();
            }
            // checking the  number is even or odd
    public static void isItOddorEvenNumber(int number){
                // ternary operator is used
        String evenOrodd = (number%2==0)?"Even" : "odd";
        System.out.println("The" + number + "is" + evenOrodd + "number");

    }

}
