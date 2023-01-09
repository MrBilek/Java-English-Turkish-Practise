package Test3;

public class newconcept {
    public static void main(String[] args) {


// str "cok" iceriyor mu

        String str= "Java ile kodlama cok kolay";

        System.out.println(str.contains("cok"));

    // kullanicidan aldigimiz cumle cok ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("y"));

        System.out.println(str.indexOf("a", 5));

        int ilkOindexi= str.indexOf("o");
        int ikinciOindexi=str.indexOf("o",ilkOindexi+1);

        System.out.println(ilkOindexi+ " "+ikinciOindexi);

    }
}
