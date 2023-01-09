package Test3;

import java.util.Scanner;

public class C06_IndexOfsorulabilir {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle girin");

        String girilenCumle = scan.nextLine();

        // sinavlarda inanılmaz cokdan sinav yapiyoruz
        // javayi cok seviyoruz
        //bu kadar coklu secenek olur mu

        if (!girilenCumle.contains("cok")) {
            System.out.println("cümlede cok ile baslayan kelime yok");

        }else {
            int cokIndexi= girilenCumle.indexOf("cok");
            int boslukIndexi=girilenCumle.indexOf(" ",cokIndexi+1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));


        }
    }
}