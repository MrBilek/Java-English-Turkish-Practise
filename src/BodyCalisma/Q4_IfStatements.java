package BodyCalisma;

import java.util.Scanner;

public class Q4_IfStatements {
    public static void main(String[] args) {

//page 66

        //ogrenciden notunu rakam olarak alip harf olarak yazdirin

        // 0-49,99 DD
        // 50- 64,99 CC
        // 65- 84,999 BB
        // 85- 100 AA















        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        double not = scan.nextDouble();

        if (0 <= not && not < 50) {
            System.out.println("Notunuz DD");
        }

        if (50 <= not && not < 65) {
            System.out.println("Notunuz CC");

        }
        if (65 <= not && not < 85) {
            System.out.println("Notunuz BB");
        }
        if (85 <= not && not <=100) {
            System.out.println("Notunuz AA");
        }
    }
}