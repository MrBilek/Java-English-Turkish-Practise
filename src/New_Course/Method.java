package New_Course;

public class Method {
    public static void main(String[] args) {
        sayiBulmaca();


    }
    public static void sayiBulmaca(){
        int[] numbers= new int[] {1,2,5,7,9,0};

        int search=5;
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

    public static void messages(int search){

        System.out.println("There is a number"+search);

    }

}
