package Test3;

public class newone {

    public static void main(String[] args) {

        int inputBas= 34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.println(i+" ");

            sayac++;
            toplam+=i;


        }

        System.out.println(" ");
        System.out.println("Toplam"+ sayac+ "adet sayi var\n Bu sayilarin toplami: "+toplam);


    }
}
