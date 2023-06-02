package homework_week_7;

import java.util.Arrays;

/**
 * Write a java Program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main (String [] args){
        // numeric array declaration
        int [] numArray = { 1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};

        // string Array declaration
        String [] strArray = { "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "peter", "Kilo" };
        System.out.println("Actual Numerical Array was : " + Arrays.toString(numArray));

        // sorting the Array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is : " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual string Array was : " + Arrays.toString(strArray));
        // sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is :" + Arrays.toString(strArray));
    }
}
