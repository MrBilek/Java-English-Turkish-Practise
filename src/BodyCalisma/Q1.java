package BodyCalisma;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //Kullanicidan bir double bir de int sayi alip
          //      bunlarin toplami ve carpimini yazdirin


Scanner scan= new Scanner(System.in);


        double count1= scan.nextDouble();
        System.out.println("bir double sayi girin");

        int count2= scan.nextInt();
        System.out.println("tam sayi girin");

        System.out.println("girilen sayilarin toplami:"+ (count1+count2));

        System.out.println("girilen sayilarin bolumu:"+ (count1/count2));


















/* Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ondalikli bir sayi girin");
         double sayi1= scan.nextDouble();

        System.out.println("Lütfen bir tam sayi girin");
        int sayi2= scan.nextInt();

        System.out.println("Sayilarin toplami:"+(sayi1+sayi2));

        System.out.println("Sayilarin carpimi:"+ (sayi1*sayi2));


/*

 */

    }
}
