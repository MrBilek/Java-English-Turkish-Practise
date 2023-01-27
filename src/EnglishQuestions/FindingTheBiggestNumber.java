package EnglishQuestions;

import java.util.Scanner;

public class FindingTheBiggestNumber {
    public static void main(String[] args) {



        // Question:  Write a Java program that accept three numbers and find the biggest one.


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
