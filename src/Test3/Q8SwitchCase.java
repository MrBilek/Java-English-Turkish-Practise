package Test3;

public class Q8SwitchCase {
    public static void main(String[] args) {

       int sayi1=20;
       int sayi2=10;
       
       char islem='*';


       
       if (islem=='+'){
           System.out.println(" sayilarin toplami "+ (sayi1+sayi2));
       }
       else if (islem=='-') {
           System.out.println(" sayilarin farki "+ (sayi1-sayi2));

       } else if (islem=='*') {
           System.out.println(" sayilarin carpimi "+ (sayi1*sayi2));
       } else if (islem=='/') {
           System.out.println(" sayilarin bolumu "+ (sayi1/sayi2));

       }else System.out.println(" yanlis islem tercihi ");


        System.out.println("**************Switch ile yapalım") ;

        switch (islem){

            case '+':
                System.out.println("sayilarin toplami "+ (sayi1+sayi2));
                break;

            case '-':
                System.out.println("sayilarin farkı "+ (sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayilarin carpimi "+ (sayi1*sayi2));
                break;
            case '/':
                System.out.println("sayilarin bolumu "+ (sayi1/sayi2));
                break;

            default:
                System.out.println("yanlis islem tercihi ");

        }



    }

    }

