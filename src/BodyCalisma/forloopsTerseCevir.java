package BodyCalisma;

public class forloopsTerseCevir {
    public static void main(String[] args) {

        //kullanicidan string isteyin ve tersine cevirin

        String str= "Hey gidi günler hey";

        String ters="";

        for (int i = str.length()-1; i >=0 ; i--) {

            ters=str+=str.substring(i,i+1);



        }
        System.out.println(ters);
    }
}
