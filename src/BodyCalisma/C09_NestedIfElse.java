package BodyCalisma;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz \n K:Kadin E:Erkek ");
        char cinsiyet= scan.next().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (cinsiyet== 'K' || cinsiyet=='k'){

            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin :"+(60-yas)+"yil daha calismalisin" );
            

        }else if (cinsiyet== 'E' || cinsiyet=='e'){
            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin :"+(65-yas)+"yil daha calismalisin" );



        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }



    }
}
