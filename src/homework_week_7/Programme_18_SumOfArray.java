package homework_week_7;

import java.util.Arrays;

/**
 * Write a java program to sum value of an array.
 */
public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        // numeric array declaration
        int [] numArray = { 1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;

        // calculating the sum of arrays value using for loop
        for (int i =0; i< numArray.length; i++){
            sum = sum + numArray [i];

        }
        System.out.println("value of the elements of the array are : " + Arrays.toString(numArray));
        System.out.println("sum of all the value of the array are : " +sum);

    }


}
