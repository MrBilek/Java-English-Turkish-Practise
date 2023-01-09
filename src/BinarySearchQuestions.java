import java.util.Arrays;

public class BinarySearchQuestions {
    public static void main(String[] args) {


int []arr= {2,8,4,5,6,7};


        System.out.println(Arrays.binarySearch(arr, 2));

Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,8)); //5

        System.out.println(Arrays.binarySearch(arr,12)); // -7



    }
}
