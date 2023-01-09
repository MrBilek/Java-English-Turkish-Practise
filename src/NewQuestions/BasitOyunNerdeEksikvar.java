package NewQuestions;

import java.util.Random;
import java.util.Scanner;

public class BasitOyunNerdeEksikvar {
    public static void main(String[] args) {


        Random rnd= new Random();
        int tutulanSayi= rnd.nextInt();

        int sayac= 1;
        int tahmin=0;

        Scanner scan= new Scanner(System.in);

        while (tutulanSayi!=tahmin){
            System.out.println("LÜTFEN TAHMİN GİRİN");
            tahmin= scan.nextInt();


            if (tutulanSayi== tahmin){
                System.out.println(sayac + "tahmin ile tuttugum sayiyi buldun");

                if (sayac<=3){
                    System.out.println("vaw");
                } else if (sayac<=8) {
                    System.out.println("aferin");


                }else {
                    System.out.println("basarisiz");
                }
            break;

            } else if (tahmin<tutulanSayi) {
                System.out.println("sayiyi buyult");
                sayac++;

            }else {
                System.out.println("sayiyi kucult");
                sayac++;
            }
        }




    }
}
