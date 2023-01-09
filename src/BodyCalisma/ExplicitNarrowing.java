package BodyCalisma;

public class ExplicitNarrowing {
    public static void main(String[] args) {

        // autowidening olmayanlarda sorumlulugu almak icin deger kısmının onune parantez ac kapat hangi variable
        // ise o variable
        // i yaz sorumlulugu alırsan kabul eder.


        double dbl= 3.14;
        int sayi= (int)dbl;

        System.out.println(sayi); //ondalik kismi atar
        //ornekteki gibi.... :)


        byte byt= (byte) sayi;// ne yapabiliriz.
        System.out.println(byt); //3


        sayi=155;
        byt=(byte) sayi;
        System.out.println(byt);







    }

}
