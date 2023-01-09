package Test3.e;

public class whileloop {
    public static void main(String[] args) {

        System.out.println("*************For Loop ile***************");


        for (int i = 10; i < 100; i++) {

            if (i%7==0){
                System.out.print(i+" ");
            }
            
        }

        System.out.print("*************while loop ile***************");

         int s=10;
        while (s<100){
            if (s%7==0){
                System.out.print(s+" ");
            }
            s++;
        }
        
    }
}
