package Inheritance;

public class BDoktor extends Apersonel {

    public static void main(String[] args) {


        BDoktor dr1= new BDoktor();

        dr1.name= "Orhan";
        dr1.surName="Bilek";
        dr1.phone=" Phone number Null";


        System.out.println(dr1.name+" "+dr1.surName+" "+dr1.phone);

        dr1.maas();
        dr1.OzelSigorta();
        dr1.nobet();
    }
    public void maas(){
        System.out.println("Doktor maası 30*8*25: "+6000);



    }

    public void nobet(){
        System.out.println("Doktorlar haftada 1 gün nobet tutarlar");


    }
}
