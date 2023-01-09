package Test3.e;

import java.util.Scanner;

public class toplamaıslemi {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int toplam=0;
        int sayi=0;

        for (int i = 0; i <=10000 ; i++) {

            System.out.println("toplamak üzere tam sayi giriniz");

            sayi= scan.nextInt();
            toplam += sayi;

            if (toplam>=500){
                System.out.println("BU KADAR SAYİ YETER "+   toplam + " oldu");
                break;

            }

        }
        toplam=0;
        sayi=0;

        while (toplam<500){
            System.out.println("toplamak üzere tam sayi giriniz");

            sayi= scan.nextInt();

            toplam+= sayi;

        }
        System.out.println("bu kadar sayı yeter " +toplam+ " oldu");

    }
}
