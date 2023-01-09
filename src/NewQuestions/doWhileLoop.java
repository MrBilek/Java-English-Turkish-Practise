package NewQuestions;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

// kullanicidan istedigi kadar sayi alın ve toplayin
        // kullanıcı deger olarak 0 a basarsa islemi bitirin

        int girilenSayı=0;
        int toplam=0;
        Scanner scan= new Scanner(System.in);

        do{

            System.out.println("lütfen tam sayi girin");
            girilenSayı= scan.nextInt();
            toplam+=girilenSayı;

        }while (girilenSayı!=0);

        System.out.println("Girilen sayilarintoplamı:" +toplam);


    }
}
