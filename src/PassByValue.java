import java.util.ArrayList;
import java.util.List;

public class PassByValue {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar); //[10, 34, 45]
        elemanlariDegistir(sayilar); //[25, 54, 67]

        System.out.println("1.method call dan sonra sayilar:"+sayilar);//[25, 54, 67]
        yenListAta(sayilar);

        System.out.println("2.METHOD CALL DAN SONRA SAYİLAR:"+sayilar);

        /*



         */

    }

    public static void elemanlariDegistir(List<Integer> sayilar) {

       sayilar.set(0,25);
       sayilar.set(1,54);
       sayilar.set(2,67);
        System.out.println("elemanlari degistir methodunda list:"+sayilar); //[25, 54, 67]


    }
public static void yenListAta(List<Integer>sayilar){

        sayilar= new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);

    System.out.println("Ynei list ara methodunda sayilar List'in son hali:"+sayilar);//[34, 98, 11]
}
}
