package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input seller id, seller name, sales amount, and basic salary
 * then fined this sales
 *Commission
 * Sales amount &gt; = 50000 35%
 * Sales amount &gt = 30000 20 %
 * &gt; = 20000 10%
 * &gt; = 10000 5%
 * &lt; = 10000 2%
 */
public class Programme_7_SalesCommission {

        public static void main (String [] args){
            // scanner  declaration for reading input from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the seller Name :");
            String name = scanner.nextLine();
            System.out.println("Enter Seller ID :");
            int sellerId = scanner.nextInt();
            System.out.println("Enter Sales Amount :");
            int salesAmount = scanner.nextInt();
            System.out.println("Enter the Basic salary :");
            int basicSalary = scanner.nextInt();

            // creating the object to call instance method

            Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
            int grossSalary = basicSalary + salesCommission.calculateCommision(salesAmount);
            System.out.println("Seller name is            : " + name);
            System.out.println("Seller id is              : " + sellerId);
            System.out.println("Seller's sales amount is  : " + salesAmount);
            System.out.println("Seller's basic salary is  : " + basicSalary);
            System.out.println("Seller's gross salary is  : " + grossSalary);
            // closing the scanner object
            scanner.close();
        }

        //  Calculating the sales commision
    public int calculateCommision(int salesAmount){
            int commission;
            if (salesAmount >= 50000){
                commission = (salesAmount * 35) /100;
                System.out.println("sales Commision is " + commission);
            } else if (salesAmount >= 30000) {
                commission = (salesAmount * 20 ) / 100;
                System.out.println("Sales Commision is " + commission);
            } else if (salesAmount >= 20000) {
                commission = (salesAmount * 10) /100;
                System.out.println("Sales Commision is " + commission);
            } else if (salesAmount >= 10000) {
                commission = (salesAmount * 5) /100;
                System.out.println("Sales Commision is  " +commission);
            }else {
                commission = (salesAmount * 2 ) /100;
                System.out.println("Sales Commision is " + commission);
            }
            return commission;
    }
}
