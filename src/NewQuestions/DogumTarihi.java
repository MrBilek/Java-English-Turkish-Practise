package NewQuestions;

import java.time.LocalDate;
import java.time.Period;

public class DogumTarihi {
    public static void main(String[] args) {

       LocalDate bday= LocalDate.of(2021,02,16);
       LocalDate today= LocalDate.now();

       Period age= Period.between(bday,today);
        System.out.println(age); //P1Y10M30D






    }
}
