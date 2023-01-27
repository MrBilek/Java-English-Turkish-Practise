package NewQuestions;



public class Varargs2 {
    public static void main(String[] args) {
        //methodda kac argument yazsam da argumentlerin toplamini versin

        topla(6);
        topla(4,5,2,8,7);

    }

    private static void topla(int... sayilar) {

        int toplam1=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam1+= sayilar[i];

        }
        System.out.println(toplam1);

        int toplam2=0;
        for (int each:sayilar
             ) {
        toplam2+=each;
        }
        System.out.println(toplam2);
    }
}
