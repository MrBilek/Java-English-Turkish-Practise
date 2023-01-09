package NewQuestions;

import java.util.Arrays;

public class passbyvaluecokluelement {
    public static void main(String[] args) {

        int[]arr ={3,6,9,1,7};

elementleriDesgistir(arr);
}
    public static void elementleriDesgistir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));

    }
}
