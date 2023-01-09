package Test3;

import java.util.Scanner;

public class sorunew {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("baslangic degerini giriniz");

        int baslangic= scan.nextInt();
        System.out.println("bitis degerini giriniz");
        int bitis= scan.nextInt();

        for (int i = baslangic; i <=bitis; i++) {

            if (i%5==0);
            System.out.println(i+ " ");



        }


    }
}
