package EnglishQuestions;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {

        // Write a code about Rectangular's area and perimeter

        // Clues: Perimeter of rectangle= 2*(long edge + short edge)
        //        Area of Rectangle = long edge * short edge


        Scanner scan= new Scanner(System.in);

        double longEdge=5;
        double shortEdge=10;

        System.out.println("Perimeter of rectangle: "+2*(longEdge + shortEdge));

        System.out.println("long edge * short edge: "+longEdge*shortEdge);





    }
}
