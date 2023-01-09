package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FOReachLoop {
    public static void main(String[] args) {

        Integer []arr= {3,2,5,6,7};
        List<Integer>list1= new ArrayList<>();

        for (Integer each:arr
             ) {
            list1.add(each);

        }
        System.out.println(list1);

        List<Integer>ciftSayilar= new ArrayList<>();

        for (Integer each: arr
             ) {
            if (each%2==0){
                ciftSayilar.add(each);
            }
        }
        System.out.println(ciftSayilar); //[2, 6]

    }
}
