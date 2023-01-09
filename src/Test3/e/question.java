package Test3.e;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        //kullancidan 2 sayi ve istedigi islemi alin (+ / * - )
        // bir method olusturup sayilara istenen islemi uygulayip sonucu bize dondurun
        //kullanici dogru islemi yanlis secmisse 0 dondurun


        Scanner scan= new Scanner(System.in);
        System.out.println("lÜTFEN 2 SAYİ GİRİNİZ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Lütfen bir islem secin +, -, /, *");

        char islem= scan.next().charAt(0);
        System.out.println(hesap(sayi1,sayi2,islem));


    }
     public static double hesap(double sayi1, double sayi2, char islem) {

         switch (islem) {

             case '+':
                 return sayi1 + sayi2;

             case '-':
                 return sayi1 - sayi2;


             case '/':
                 return sayi1 / sayi2;

             case '*':
                 return sayi1 * sayi2;

             default:

         }

         return sayi1;
     }
}
