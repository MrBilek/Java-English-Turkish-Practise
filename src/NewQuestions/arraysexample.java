package NewQuestions;

import java.util.Arrays;

public class arraysexample {
    public static void main(String[] args) {


        String[] arr= new String[4];

        int [] arr2= {3,4,5,6,7,8,};


        System.out.println(arr2[2]);



        arr2[2]=15;
        arr2[0]=7;
        System.out.println(arr2); // [I@48140564

        System.out.println(Arrays.toString(arr2));

    }
}
