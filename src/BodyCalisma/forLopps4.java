package BodyCalisma;

import java.util.Scanner;

public class forLopps4 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin



        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 2 pozitif tam ayi giriniz");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();



        if (bitis<baslangic){
            System.out.println("Uyari: islem sonlandirildi");
        } else {
            int toplam=0;


            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;


            }
            System.out.println(baslangic+"ile"+bitis+"arasındaki sayilarin toplami:"+toplam);

        }
    }
}










      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen pozitif iki tam sayi girin");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis<baslangic){
            System.out.println("Uyari: islem sonlandirildi");
            
        }else {
            
            int toplam=0; //variable atamamız gerektigi icin

            for (int i = baslangic; i <=bitis; i++) {

        toplam+=i; //her gelen i yi toplama eklemek icin

                
            }
            System.out.print(baslangic+"ile " +bitis+" arasindaki sayilarin toplami: "+toplam);
        }
/*

       */

