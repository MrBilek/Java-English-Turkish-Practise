package NewQuestions;

import java.util.Scanner;

public class doWhileLoopsExam {
    public static void main(String[] args) {

        char baslangic= 'a';
        char bitis= 'z';
        Scanner scan= new Scanner(System.in);


        do {

            System.out.print(baslangic+ " ");
            baslangic= (char)(baslangic+1);


        }while (baslangic<=bitis);

    }
}
