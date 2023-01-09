package Test3;

import java.util.Scanner;

public class q3_yasproblemi {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        // Yil daha calisman gerekir” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz :\nK Kadin, E Erkek");
        char cinsiyet = scan.next().charAt(0);


        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        if (cinsiyet == 'K' || cinsiyet == 'k') {

            if (yas <= 18 || yas > 80) System.out.println("gecersiz yas");

            else if (yas >= 60) System.out.println("emekli olabilirsin");

            else System.out.println("emekli olmak icin " + (60 - yas) + " yıl daha calismalisin");


        } else if (cinsiyet == 'E' || cinsiyet == 'e') {

            if (yas <= 18 || yas > 80) System.out.println("gecersiz yas");

            else if (yas >= 65) System.out.println("emekli olabilirsin");

            else System.out.println("emekli olmak icin" + (65 - yas) + " yıl daha calismalisin");

        }else {
            System.out.println( "cinsiyet bilgisi hatalı");
        }


    }

}