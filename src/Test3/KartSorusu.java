package Test3;

import java.util.Scanner;

public class KartSorusu {
    public static void main(String[] args) {
        //Kullanıcıdan aldıgı ürün adedi ve liste fiyatını alın,
        //kullanıcıya müsteri kartı olup olmadıgını sorun
        //Müsteri kartı varsa 10üründen fazla alırsa %20, yoksa %15 indirim yapın,
        // Müsteri kartı yoksa 10 üründen fazla alırsa %15, yoksa %10 indirim yapın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urnAdedi = scan.nextInt();

        System.out.println("liste fiyatını giriniz");
        double ListeFiyati = scan.nextDouble();

        System.out.println("Müsteri kartı var mi? \n E:Evet H: Hayır");
        char kartVarmi = scan.next().charAt(0);

        if (kartVarmi == 'E' || kartVarmi== 'e'){
            if (urnAdedi <=0) System.out.println("gecersiz urun miktari");

            else if (urnAdedi>10) System.out.println("%20 indirimli fiyat" + urnAdedi * ListeFiyati * 0.8);
            else System.out.println("%15 indirimli fiyat" + urnAdedi * ListeFiyati * 0.85);

        } else if (kartVarmi == 'H' || kartVarmi== 'h') {


            if (urnAdedi <=0) System.out.println("gecersiz urun miktari");

            else if (urnAdedi>10) System.out.println("%15 indirimli fiyat" + urnAdedi * ListeFiyati * 0.85);
            else System.out.println("%10 indirimli fiyat" + urnAdedi * ListeFiyati * 0.9);
        }



    }
    }
