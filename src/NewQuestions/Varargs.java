package NewQuestions;

public class Varargs {
    public static void main(String[] args) {

        //verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(5,8);

        topla(3,5,7);
        topla(2,5,7,6);


    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {

        System.out.println("Dort sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
    }


    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("uc sayinin toplami:"+(sayi1+sayi2+sayi3));
    }


    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami"+ (sayi1+sayi2));
    }
}
