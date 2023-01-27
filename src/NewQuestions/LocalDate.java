package NewQuestions;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate {
    public static void main(String[] args) {

       LocalDateTime TarihZaman= LocalDateTime.now();
        System.out.println(TarihZaman); //2023-01-09T22:17:01.199082800

        LocalTime saat= LocalTime.now();
        System.out.println(saat); //22:17:55.409114300

        LocalTime time= LocalTime.now();
        System.out.println(time);

        // bir for loop ile 1 den 10.000e kadar olan sayilari yanyana yazdirin
        //bu islem icin gecen zamani bulunuz


        for (int i = 1; i <=10000 ; i++) {
            System.out.print("baslangic"+time);

        }
        System.out.println("");
        System.out.println("bitis:"+time);
    }
}
