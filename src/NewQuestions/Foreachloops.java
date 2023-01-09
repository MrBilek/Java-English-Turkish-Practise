package NewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreachloops {
    public static void main(String[] args) {

        Integer []arr ={3,2,5,4,7,8,8,2,5,6};

        List<Integer>list= new ArrayList<>();

        for (Integer each: arr
             ) {
            if (!list.contains(each));
            list.add(each);
        }

arr= new Integer[list.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=list.get(i);

        }
        System.out.println("Arrayin son hali:" +Arrays.toString(arr));//Arrayin son hali:[3, 2, 5, 4, 7, 8, 8, 2, 5, 6]
    }
}
