package Test3;

import java.util.Scanner;

public class indexoff {
    public static void main(String[] args) {

          Scanner scan= new Scanner(System.in);
        System.out.println("bir cümle giriniz");

    String girilenCumle= scan.nextLine();

if (!girilenCumle.contains("cok")) {
    System.out.println("cumlede cok ile baslayan kelime yok");

}else {

    int cokIndexi= girilenCumle.indexOf("cok");
    int boslukindexi= girilenCumle.indexOf(" ",cokIndexi+1);

    System.out.println(girilenCumle.substring(cokIndexi, boslukindexi));


}


    }
}
