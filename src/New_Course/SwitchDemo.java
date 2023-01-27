package New_Course;

import java.sql.SQLOutput;

public class SwitchDemo {
    public static void main(String[] args) {

       char grade= 'C';

       switch (grade){
           case 'A':
               System.out.println("Great");
               break;
           case 'B':
               System.out.println("Well done");
               break;
           case 'C':
               System.out.println("Not bad");
               break;
           case 'D':
               System.out.println("Unfortunately, Failed");
               break;
           default:
               System.out.println("Invalid note");

       }


    }
}
