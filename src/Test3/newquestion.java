package Test3;

public class newquestion {
    public static void main(String[] args) {

        /*
            Bir arıtma tesisinde arıtılan su miktarı günde 5000 metreküptür.
            Arıtılan her 1 metreküp  suyun birim arıtma bedeli arıtılan su hacmine göre değişmektedir.
            Tarife aşağıdaki gibidir:

            2.5 TL (0 – 30.000 metreküp arası)
            3.0 TL (30.000 – 50.000 metreküp arası)
            3,5 TL ( >50.000 metreküp )

            Buna göre, 1 yıl boyunca gün gün arıtma masraflarını toplam olarak bulan ve aşağıdaki
            ekran görüntüsüne sahip olacak bir program hazırlayınız.



            Arıtma Tesisi Günlük Arıtma Masrafı Listesi
                    ……………………………………………….
            1.Gün Sonunda Masraf = …….. TL
            2.Gün Sonunda Masraf = ………TL
            3.Gün Sonunda Masraf = ………TL

            XX. Gün Sonunda Masraf = ……..TL

         */
        double hacim = 5000; // metreküp
        double tarife1 = 2.5; // TL (0 - 30.000 metreküp arası)
        double tarife2 = 3.0; // TL (30.000 - 50.000 metreküp arası)
        double tarife3 = 3.5; // TL (>50.000 metreküp)

        double toplam_masraf = 0;
        for (int i = 1; i <= 365; i++) {
            double masraf;
            if (hacim <= 30000) {
                masraf = hacim * tarife1;
            } else if (hacim <= 50000) {
                masraf = hacim * tarife2;
            } else {
                masraf = hacim * tarife3;
            }
            toplam_masraf += masraf;
            System.out.println(i + ". Gün Sonunda Masraf = " + masraf + " TL");
        }
        System.out.println("XX. Gün Sonunda Toplam Masraf = " + toplam_masraf + " TL");
    }
}