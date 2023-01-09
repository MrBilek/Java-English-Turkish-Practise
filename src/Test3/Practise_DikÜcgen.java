package Test3;

import java.util.Scanner;

public class Practise_DikÜcgen {
    public static void main(String[] args) {

        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen 3 adet sayı aliniz");


        System.out.println("1.kenar uzunlugunu giriniz");
        int a= scan.nextInt();


        System.out.println("2.kenar uzunlugunu giriniz");
        int b= scan.nextInt();


        System.out.println("3.kenar uzunlugunu giriniz");
        int c= scan.nextInt();

        if ((a*a)+(b*b)== (c*c)); //Bu bir dik ucgendir.

        else if ((b*b)+(c*c)==(a*a)) { //Bu bir dik ucgendir.

        } else if ((a*a)+(c*c)==(b*b)) { //Bu bir dik ucgendir.

        }else
            System.out.println("Bu bir dik ucgen degildir!");



        System.out.println("================2.cozum================ ");

        if( (a*a)+(b*b) == (c*c) || (b*b)+(c*c)==(a*a)|| (a*a)+(c*c)==(b*b) )
            System.out.println("Bu bir dik ucgendir");

            else
            System.out.println("bu bir dik ucgen degildir");




        }


    }

