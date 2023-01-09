package NewQuestions;

public class soruuu {
    public static void main(String[] args) {

        double[] fiyatlar= {23,34.5,42.1,3,4};
enYuksekeNDusukFiyatYazdir(fiyatlar);
    }

    public static void enYuksekeNDusukFiyatYazdir(double[]fiyatlar){

        double enDusukFiyat=fiyatlar[0];
        double enYuksekFiyat= fiyatlar[0];


        for (int i = 0; i < fiyatlar.length; i++) {

            if (fiyatlar[i]<enDusukFiyat){
                enDusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("Listedekii en dusuk :"+enDusukFiyat);

        System.out.println("Listedeki en yuksek :"+ enYuksekFiyat);

    }


}
