package NewQuestions;

public class c04_MultiDimensional {
    public static void main(String[] args) {

         int [][] arr={{3,4,8},{2,4,6},{7,5,6}};

         SayilarTopla(arr);

    }

    public static void SayilarTopla(int[][]arr){

int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam+= arr[i][j];
                System.out.println("toplam: "+toplam);

            }

        }



    }


}
