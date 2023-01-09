package Test3.e;

public class Soru2 {
    public static void main(String[] args) {
/*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
 */
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String []ulkeler : food){

            for (String yemek : ulkeler){

                System.out.println(yemek);


            }
            System.out.println("...................");
        }


        System.out.println("=========================For i Cozumu==============");


        String[]ulkeler = {"american", "italian", "asian","afghan","indian"};

        for (int i = 0; i < food.length; i++) {

            System.out.println("--------------"+ulkeler[i] + "---------------- ");

            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);

            }



        }


    }



}
