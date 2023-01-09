package NewQuestions;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        int [] arr1= {3,2,8};
        int [] arr2= {5,7,6};

        System.out.println(Arrays.equals(arr1, arr2));

        String str= "Zeynep, yemegini yedi";

        String []arrVirgul=str.split(",");

        System.out.println(Arrays.toString(arrVirgul));

        String []arrBosluk=str.split("");

        System.out.println(Arrays.toString(arrBosluk));

        String str3= "Java her gecen gun guzellesiyor";

        String[]arrKelime= str3.split(" ");
        System.out.println(Arrays.toString(arrKelime));



    }
}
