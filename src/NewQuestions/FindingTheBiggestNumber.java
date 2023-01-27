package NewQuestions;

import java.util.Scanner;

public class FindingTheBiggestNumber {
    public static void main(String[] args) {



        // Write a Java program that accept 3 numbers and find the biggest number.


        Scanner scan= new Scanner(System.in);
        System.out.println("enter the three number please");

        int firstNumber= scan.nextInt();
        int secondNumber= scan.nextInt();
        int thirdNumber= scan.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("The biggest number is "+firstNumber);


        } else if (secondNumber>firstNumber&&secondNumber>thirdNumber) {
            System.out.println("The biggest number is "+secondNumber);

        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber ) {
            System.out.println("The biggest number is " + thirdNumber);

        }else {
            System.out.println("Invalid entry");
        }


    }
}
