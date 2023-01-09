package BodyCalisma;

import java.util.Scanner;

public class IFC {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen tam sayi giriniz");

        int girilenSayi= scan.nextInt();

        if (girilenSayi%5==0) System.out.println("girilen sayi 5 ile bolunebiliyor");
        else System.out.println( "girilen sayi 5 in kati degil");



    }
}
