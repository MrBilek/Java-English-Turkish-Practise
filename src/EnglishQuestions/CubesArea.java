package EnglishQuestions;

import java.util.Scanner;

public class CubesArea {
    public static void main(String[] args) {
      //  Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

           //     Ipuclari:

 //Sayilarin ortalamasi: toplam/5


        // Get Five numbers from the user then write the java code that calculates the average of these numbers.

     // clues: Number's avarage is total number devide 5

        Scanner scan= new Scanner(System.in);
        System.out.println("Write five positive numbers please");

        int number1= scan.nextInt();
        int number2= scan.nextInt();
        int number3= scan.nextInt();
        int number4= scan.nextInt();
        int number5= scan.nextInt();

        System.out.println("Number's avarage is:"+(number1+number2+number3+number4+number5)/5);

    }
}
