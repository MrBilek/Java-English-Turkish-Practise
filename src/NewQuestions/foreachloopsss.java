package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class foreachloopsss {
    public static void main(String[] args) {

        int []arr1= {3,5,6,1,3,7};
        int [] arr2= {3,8,9,5,2};

        List<Integer>ortakElementler= new ArrayList<>();

        for (int eachArr1: arr1
             ) {
            for (int eachArr2:arr2
                 ) {
                if (eachArr1==eachArr2){

                    if (!ortakElementler.contains(eachArr1)){
                        ortakElementler.add(eachArr1); //[3, 5]
                    }
                }
            }
        }

        System.out.println(ortakElementler);

    }
}
