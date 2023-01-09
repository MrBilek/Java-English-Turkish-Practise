package NewQuestions;

import java.util.Arrays;

public class arrayaElementEkleme {
    public static void main(String[] args) {


        String[]isimler= {"Ali", "Veli","Cem"};
        String eklenecekIsım=  "Kemal";
isimler=arrayaElement(isimler,eklenecekIsım);

        System.out.println(Arrays.toString(isimler));



    }

public static String[] arrayaElement(String[] eklenecekArray, String eklenecekElement) {

    String[] temp = new String[eklenecekArray.length + 1];

    for (int i = 0; i < eklenecekArray.length; i++) {

        temp[i] = eklenecekArray[i];


    }
temp[temp.length-1]=eklenecekElement;

    return temp;

}



    }



