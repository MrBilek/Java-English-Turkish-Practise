package New_Course;

public class MinProjectFindNumber {
    public static void main(String[] args) {

        int[] numbers= new int[] {1,2,5,7,9,0};

        int search=4;
        boolean Isthere=false;

     for (int number: numbers){
         if (number==search){
             Isthere=true;
             break;

         }
            
        }
    if (Isthere){
        System.out.println("There is a number");
    }else {
        System.out.println("There isn't a number");
    }

    }
}
