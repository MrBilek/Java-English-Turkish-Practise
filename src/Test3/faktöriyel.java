package Test3;

public class faktöriyel {
    public static void main(String[] args) {


        int input=6;
        int carpim=1;


        for (int i = input; i <=1 ; i--) {
            carpim*=i;
        }

        System.out.println("verilen"+input+"sayisinin faktöryeli"+carpim);

    }
}
