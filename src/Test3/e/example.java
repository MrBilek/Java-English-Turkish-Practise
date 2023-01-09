package Test3.e;

public class example {
    public static void main(String[] args) {

       /* input olarak verien sayinin
                asal olup olmadıgını yazdirin


        */

        int input = 35;

        String sonuc= " Sayi asal";

        for (int i = 2; i < input; i++) {

            if (input % i == 0) {
                sonuc= "Sayi asal degil";



            System.out.println(sonuc);
            break;

        }

        }

    }
}