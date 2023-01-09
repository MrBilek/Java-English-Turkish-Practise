public class newquestion {
    public static void main(String[] args) {

        String[][] arr = {{"Ali", "Veli"}, {"Kim bu", "Deli", "Soyle"}, {"Sene artik"}};


        String searchWord = "e";

        istenenElement(arr,searchWord);
        istenenElement(arr, "i");


    }

    public static void istenenElement(String[][]arr, String searchWord) {


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(searchWord)){

                    System.out.print(arr [i][j]+ " ");
                }


                }

            }

        System.out.println("******************");

        }


    }









