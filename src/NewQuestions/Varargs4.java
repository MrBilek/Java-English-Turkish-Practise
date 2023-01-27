package NewQuestions;

public class Varargs4 {
    public static void main(String[] args) {

        islemYap(3,2,1,5,4,6,8,7,4,5,2,9);

        islemYap(5,56,45,10);




    }

    private static void islemYap(int ilkSayi, int...geriyeKalanlar) {

        int geriyeKalanlarToplamı=0;

        for (int each:geriyeKalanlar
             ) {
            geriyeKalanlarToplamı+=each;
        }
        System.out.println(geriyeKalanlarToplamı*ilkSayi);

    }
}
