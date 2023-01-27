package BodyCalisma;

import java.util.Scanner;

public class terstenyazdirma {
    public static void main(String[] args) {


  Scanner scan= new Scanner(System.in);

        System.out.println("Hey gidi günler hey");

        String str= scan.nextLine();

        String terstenyazdirma="";

        for (int i = str.length()-1; i <=0 ; i++) {
            terstenyazdirma+=str.charAt(i);


        }

        System.out.println("Metnin tersi:"+terstenyazdirma);
    }
}
