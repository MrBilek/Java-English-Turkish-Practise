package Test3;

import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen sifrenizi giriniz");
        String girilenMail= scan.nextLine();

        if (!girilenMail.contains("@")) {
        System.out.println("gecersiz mail");


    } else if (!girilenMail.contains("gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!girilenMail.endsWith("@")) {
            System.out.println("mail hatasi var");
        }
    }}
