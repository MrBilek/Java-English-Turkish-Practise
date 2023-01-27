package BodyCalisma;

import java.util.Scanner;

public class stringMan {
    public static void main(String[] args) {
        // Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

Scanner scan= new Scanner(System.in);

        String str= "cok is var";


        if (str.contains("ev")){
            System.out.println("home home sweet home");

        } else if (str.contains("is")) {
            System.out.println("calismak guzeldir");

        } else if (str.contains("ev")&&(str.contains("is"))) {
            System.out.println("Hem ev lazim hem is");

        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
