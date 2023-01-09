package BodyCalisma;

import java.util.Scanner;

public class not {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("notunuzu girin");

        int not= scan.nextInt();



        if (not>=50&& not<=100) System.out.println("sinifi gectin");
        else if (not<0 ||not>100) System.out.println("gecersiz not");

        else System.out.println("malesef kaldin");
    }
}
