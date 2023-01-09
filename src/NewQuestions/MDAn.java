package NewQuestions;

import java.util.Arrays;

public class MDAn {
    public static void main(String[] args) {

        int [][] arr= {{3,4,5},{2,3,6,7},{4,3}};

        int enKısainnerArrayLength= arr[0].length;

        for (int i = 0; i <arr.length; i++) {

       if (arr[i].length<enKısainnerArrayLength){

           enKısainnerArrayLength=arr[i].length;


       }

            }

        int[] toplamlarArrayi= new int[enKısainnerArrayLength];
        int toplam=0;

        for (int i = 0; i < toplamlarArrayi.length; i++) {

            for (int j = 0; j < arr.length; j++) {

               toplam+= arr[j][i];

            }
toplamlarArrayi[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(toplamlarArrayi));

        }

    }

