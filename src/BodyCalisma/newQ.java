package BodyCalisma;

import java.util.Scanner;

public class newQ {
    public static void main(String[] args) {
      //  Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 sayi girin");

        double side1= scan.nextDouble();
        double side2= scan.nextDouble();
        double side3= scan.nextDouble();

        if (side1==side2&& side1==side3) System.out.println("Eskenar ücgen");
        else System.out.println("eskenar degil");

    }
}
