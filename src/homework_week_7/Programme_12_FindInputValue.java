package homework_week_7;

import java.util.Scanner;

public class Programme_12_FindInputValue {

    // find the input value is Alphabet, Digit and Symbol

    public void checkInputValueIsAlphabetNumberOrSymbol (char ch){
        if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
            System.out.println(ch + "is an Alphabet. ");
        } else if (ch >= '0' && ch<= '9') {
            System.out.println(ch + "is a Digit. ");
        }else{
            System.out.println(ch + " is a symbol. ");
        }
    }

    public static void main(String[] args) {

        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch = scanner.next().charAt(0);

        // object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //closing the scanner object
        scanner.close();
    }
}
