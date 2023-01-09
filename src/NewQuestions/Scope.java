package NewQuestions;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {

       int girilensayi=0;
       int toplam=0;
        Scanner scan= new Scanner(System.in);

       while(girilensayi!=0){
           System.out.println("Lütfen toplamak icin sayi gir");
           girilensayi= scan.nextInt();

           toplam+=girilensayi;

       }
        System.out.println("girilen sayilarin toplamı :"+toplam);

    }
}
