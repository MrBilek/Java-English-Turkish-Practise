package Test3;

public class soru3 {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok";

        System.out.println(str.indexOf("a"));

        System.out.println(str.lastIndexOf("a"));


        int ilkCokIndexi=str.indexOf("cok");
        int sonCokIndexi= str.lastIndexOf("cok");

    if (!str.contains("cok")){

        System.out.println("cok kelimesi kullanilmamis");

    } else if (ilkCokIndexi==sonCokIndexi) {
        System.out.println("bir kere kullanilmis");




        }else {

        System.out.println("birden fazla kullanilmis");


    }


    }

    }
