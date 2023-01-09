package Test3;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen bir karakter girin");

        char girilenkarakter= scan.next().charAt(0);




        for (int i = 0; i <=10; i++) {

            System.out.print((char) girilenkarakter+1);

        }


    }
}
