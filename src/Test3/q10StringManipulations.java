package Test3;

import java.util.Scanner;

public class q10StringManipulations {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün giriniz");

        String girilenGun= scan.next();

        String kullanilacakGun= girilenGun.toLowerCase();

        switch (kullanilacakGun){

            case "pazartesi":
            System.out.println("girilenGun"+ "calisma zamanı, tatile 5 gün var.");
            break;
            case "sali":
                System.out.println("girilenGun"+ "calisma zamanı, tatile 4 gün var.");
                break;
            case "carsamba":
                System.out.println("girilenGun"+ "calisma zamanı, tatile 3 gün var.");
                break;
            case "persembe":
                System.out.println("girilenGun"+ "calisma zamanı, tatile 2 gün var.");
                break;
            case "cuma":
                System.out.println("girilenGun"+ "calisma zamanı, tatile 1 gün var.");
                break;

            case "cumartesi":
                System.out.println("girilenGun"+ "Tatil");
                break;
            case "pazar":
                System.out.println("Tatil");
                break;

            default:
                System.out.println("yanlıs girilen gün");
        }




    }
}
