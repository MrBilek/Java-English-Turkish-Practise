package BodyCalisma;

import java.util.Scanner;

public class q9_IfElse {
    public static void main(String[] args) {
        //kullanicidan bir ücgenin 3 kenar uznlugunu alin ucgen eskenar ise "Eskenar ucgen degilse eskenar degil yazin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ucgenin 3 kenar uzunlugunu giriniz");

        double knr1= scan.nextDouble();
        double knr2= scan.nextDouble();

        double knr3= scan.nextDouble();

        if (knr1==knr2 && knr1==knr3&& knr2>0) {
            System.out.println("Eskenar ucgen");

        }else {
            System.out.println("Eskenar degil");
        }



    }
}
