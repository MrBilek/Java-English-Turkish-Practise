package BodyCalisma;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class question {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin. +
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        String girilenIfade="java1 ogRe2@nMek3 #ne +Gu=zel";

        String[] strArr = girilenIfade.split(" ");
        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(" ");
            System.out.print(strArr[i].replaceAll("\\d", "").replaceAll("\\W", ""));


        }
    }
}
























     /*   String str= "Java 56Guz, zel-dir";

        System.out.println(str.replace("1",""));
        System.out.println(str.replace("5",""));
        System.out.println(str.replace("6", ""));

        str= "Ja1va4 56G7uz, z9el-d0ir8";

        /*replace ()zaten istenen degişikligi verilen ozellige uyan tum degerler icin yapar  */

     /*   str=str.replaceAll("\\d", "");
        System.out.println(str); // butun digitslerden kurtulur

        //ozel kaakterlerden de kurtulmak ıcın
        // space de ozel karekter old. bu durumda space ın yok olmaması ıcın
        //once space yerıne metınde olmayan deger atayalım

        str= str.replace(" ", "5");
        str.replace("5", " ");


        System.out.println(str.replaceAll("\\W", ""));// JavaGuzzeldir

/*

 */


