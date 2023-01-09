package Test3;

public class Q6_Ternary {
    public static void main(String[] args) {


        int input=145;

        if (input>100) {
            input*=2;
        }else {
            input+=10;
        }
        System.out.println("if else ile: "+input);

        input=145;

        input= input>100 ? input*2 :input+10;

        System.out.println("ternary ile: "+input);



    }
}
