package NewQuestions;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println( "pozitif tam sayi alın");
        
        int girilenSayi= scan.nextInt();
        
        if (girilenSayi<=0){
            System.out.println("Gecersiz sayi");
        }else {
            List<Integer>tamBolenlerListesi=tamBolenlerListesiOlustur(girilenSayi);

            System.out.println(tamBolenlerListesi);
            
            
        }



    }

    public static List<Integer> tamBolenlerListesiOlustur(int girilenSayi){
        
        List<Integer>tamBolenlerListesi=new java.util.ArrayList<>();
        for (int i = 1; i < girilenSayi ; i++) {

            if (girilenSayi%i==0);
            tamBolenlerListesi.add(i);

            
        }
        
        return tamBolenlerListesi;
    }


}
