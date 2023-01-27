package BodyCalisma;

import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {

        //kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yzdirin

Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen karakter girin");

        char krk= scan.next().charAt(0);

        for (int i = 0; i <10 ; i++) {
            System.out.print((char)( krk+i)+" ");

        }








        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");

        char krktr= scan.next().charAt(0);

        for (int i = 0; i <=10; i++) {

            System.out.print(krktr+i+" ");


            System.out.print((char)(krktr+i)+" ");


        }

         */
    }
}
