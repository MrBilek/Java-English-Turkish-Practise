package Test3;

public class forloop {
    public static void main(String[] args) {


        //input olarak verilen bir String de
        //index i tek sayı olanları kücük harfle
        //index i cift sayı olanları büyük harfle yazdırınız
        //ornek: Java output: JaVa


        String input= "Java candir, Selenium heyecandir";

        for (int i = 0; i <input.length() ; i++) {

            System.out.print(i%2==0
                                ? input.substring(i,i+1).toUpperCase()

                                :input.substring(i,i+1).toLowerCase()


            );


        }



    }
}
