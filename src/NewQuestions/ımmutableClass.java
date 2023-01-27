package NewQuestions;

import java.util.Arrays;

public class ımmutableClass {
    public static void main(String[] args) {

        String str= "Java";
        System.out.println(str.toUpperCase()); //JAVA

        str.toLowerCase();
        System.out.println(str);//Java

        int[]arr= {3,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String a="ABC";
        for (int i = 0; i < 10; i++) {
            a=a+i;


        }
        System.out.println(a);
    }
}
