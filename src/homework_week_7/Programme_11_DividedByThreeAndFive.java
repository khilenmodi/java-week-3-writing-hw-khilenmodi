package homework_week_7;

/**
 * write a java program to print the number betwwen 1 to 100 which can be divided by 3 and
 * 5 separately
 */
public class Programme_11_DividedByThreeAndFive {

    // divided by three method
    public static void dividedByThree(int number){
        if (number % 3 == 0 ){
            System.out.println(number + " , ");
        }
    }
    //  divided by five number
    public static void dividedByFive( int number){
        if (number % 5 == 0 ){
            System.out.println(number + " , ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Number divisible by 3 are : ");
        for (int i =1; i<= 100; i++){
            dividedByThree(i);
        }
        System.out.println("\n -------------------------------------------------------------------------------");

        System.out.println("NUmber divisible by 5 are :");
        for (int x =1; x<=100; x++){
            dividedByFive(x);
        }

    }
}
