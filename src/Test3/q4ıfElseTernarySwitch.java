package Test3;

import java.util.Scanner;

public class q4ıfElseTernarySwitch {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");

        int sayi= scan.nextInt();

        if (0<=sayi && sayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=sayi && sayi <=100) System.out.println("girilen sayi 2 basamaklı");

        else if (sayi>=100) System.out.println("büyük sayi");

        }

        }




