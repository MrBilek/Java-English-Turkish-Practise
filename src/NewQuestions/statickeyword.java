package NewQuestions;

public class statickeyword {
    public static void main(String[] args) {

        int fiyat=100;
        // fiyat üzerinden %10 indirim yapip indirimli fiyatı donduren bir method olusturun
        System.out.println(indirim(fiyat));

        System.out.println(fiyat);

    }

public static int indirim(int fiyat){

        fiyat= fiyat*90/100;

        return fiyat;
}


}
