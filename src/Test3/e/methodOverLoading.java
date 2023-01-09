package Test3.e;

import Test3.C06_IndexOfsorulabilir;

public class methodOverLoading {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.substring(5, 10));
        toplama(10, 12);
        toplama(10,11,12);

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);

    }

    public static void toplama (int sayi1, int sayi2, int sayi3) {

        System.out.println(sayi1 + sayi2 + sayi3);







}



}




