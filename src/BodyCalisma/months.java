package BodyCalisma;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
       // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
          //      Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf yaziniz");

        char girilenHarf= scan.next().charAt(0);
        System.out.println(Character.toUpperCase(girilenHarf));



        if (girilenHarf== 'a' || girilenHarf== 'A'){
            System.out.println("girilen ay Aralik");

        }
        if (girilenHarf== 's' || girilenHarf== 'S'){
            System.out.println("girilen ay Subat");
        }

    }
}
