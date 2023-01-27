package NewQuestions;

public class Varargs3 {
    public static void main(String[] args) {


        enUzunuYazdir("İlyas","Berivan","Murat");
    enUzunuYazdir("Emrah","Mert","Zeynep");



    }

    private static void enUzunuYazdir(String... kelimeler) {


      String enUzunKelime= kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
        }

        }

