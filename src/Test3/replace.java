package Test3;

public class replace {
    public static void main(String[] args) {

        String str= "Java ogren, adana ye";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(" ", ""));


        String sonuc= "1-16 over 100,000 results for \"apple\"";

        int indexOver= sonuc.indexOf("over");
        int indexResults= sonuc.indexOf("results");

        String sonucSayisiStr= sonuc.substring(indexOver+5,indexResults-1);
        System.out.println(sonucSayisiStr);

        sonucSayisiStr= sonucSayisiStr.replace(",","");
        System.out.println(sonucSayisiStr);

        int sonucSayisiInt= Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt>10000){
            System.out.println("arama testi passed");
        }else {
            System.out.println("arama testi passed ");
        }

    }

}
