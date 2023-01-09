package Test3;

public class c05_IndexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str "cok" iceriyor mu?

        System.out.println(str.contains("cok")); //true

        // kullanicidan aldigimiz cumle cok ile baslayan ilk kelimeyi yazdirin.

        System.out.println(str.indexOf("cok"));

    // 2.O nun indexini yazdirin

        System.out.println(str.indexOf("a", 5));

//"Java ile kodlama cok kolay";


        int ilkOindexi= str.indexOf("o");//11
         int ikinciOindexi = str.indexOf("o",ilkOindexi+1);
        System.out.println(ilkOindexi+" "+  ikinciOindexi);

    }
}
