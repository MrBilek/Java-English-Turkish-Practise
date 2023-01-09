package BodyCalisma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q7_ifStatementss {
    public static void main(String[] args) {
        // kullanicidan 1 harf alin harf ile baslayan bir ay varsa yazdirin
        // kullanici o veya O yazdiginda output Ocak olsun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        char girilenHarf= scan.next().charAt(0);

        if (girilenHarf=='f' ||girilenHarf=='F') System.out.println("February");





    }
}
