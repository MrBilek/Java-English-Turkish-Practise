package BodyCalisma;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //kullanicindan bir harf isteyin
        //girilen karakter kucuk harf ise onu buyuk harf olarak yazdiirn
        // yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        char girilenHarf= scan.next().charAt(0);

        if (girilenHarf>='a'&& girilenHarf<='z'){
            System.out.println((char) (girilenHarf-32));
           // System.out.println(Character.toUpperCase(girilenHarf));


        }else {
            System.out.println("GİRİLEN HARF:"+girilenHarf);
        }


    }
}
