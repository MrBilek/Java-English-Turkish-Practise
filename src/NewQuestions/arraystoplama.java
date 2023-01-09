package NewQuestions;

public class arraystoplama {
    public static void main(String[] args) {

int[]sayilar= {3,7,1,9,-3,-11,50};
        System.out.println(pozitifSayilariTopla(sayilar));



    }

    public static int pozitifSayilariTopla(int[]arr){


int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
return toplam;

    }


}
