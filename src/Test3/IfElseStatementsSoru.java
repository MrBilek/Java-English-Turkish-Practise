package Test3;

import java.util.Scanner;

public class IfElseStatementsSoru {
    public static void main(String[] args) {

        //Soru2 - Kullanıcının kilo(kg) ve boyunu (cm)isteyip
        //vücut kitle endeksini hesaplayın (kilo*10000(boy*boy))
        //vücut kitle endeksi 30 veya daha büyükse obez,
        // 25-30 arası ise kilolu,
        //20-25 arası ise normal,
        //20 den kücükse zayıf yazdırın.


        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen agırlıgınızı kg olarak giriniz");
         double girilenKg= scan.nextDouble();

        System.out.println("Lütfen boyunuzu cm olarak giriniz");

        double girilenBoy= scan.nextDouble();


       double vke= girilenKg*10000/(girilenBoy*girilenBoy);
        System.out.println("vücud kitle indexiniz : "+vke);
        
        if (vke>=30) System.out.println("Obezsiniz");
        
        else if (vke>=25) System.out.println("kilolusunuz");

        else if (vke>=20) System.out.println("Kilonuz normal");

        else System.out.println("zayıfsınız, kilo alın");


    }
}



            





