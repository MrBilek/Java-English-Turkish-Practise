package NewQuestions;

import java.util.Arrays;

public class C05 {
    public static void main(String[] args) {

        int [][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[] toplamArray= new int[arr.length];

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length   ; j++) {


                toplam+= arr[i][j];


            }
            toplamArray[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(toplamArray));


    }
}
