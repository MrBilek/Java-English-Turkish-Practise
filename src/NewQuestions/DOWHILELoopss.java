package NewQuestions;

public class DOWHILELoopss {
    public static void main(String[] args) {

        int input = 36;
        int karekok = 1;
        boolean sonuc = false;

        while (karekok * karekok <= input) {

            if (karekok * karekok == input) {
                System.out.println("girilen sayinin karekoku: " + karekok);
                sonuc = true;
                break;
            } else {
                karekok++;
            }


        }








    }
}
