package Test3;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {

// Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolen istediginiz sayıyı giriniz :");

        int a = scan.nextInt();

        int b = scan.nextInt();

        bol(a, b);


    }

    public static int bol(int bolunen, int bolen) {
        int bolum=0;

        while (bolunen >= bolen) {

            bolunen -= bolen;


            bolum++;
        }

        return bolum;


        }


    }



