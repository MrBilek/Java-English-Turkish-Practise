package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArraydenListeYapma {
    public static void main(String[] args) {

        int [] arr= {3,2,4,5,6,7,8,8};

        List<Integer> list1= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

           list1.add(arr[i]);


        }
        System.out.println("Loop ile tasinan list: "+list1);//Loop ile tasinan list: [3, 2, 4, 5, 6, 7, 8, 8]

    }
}
