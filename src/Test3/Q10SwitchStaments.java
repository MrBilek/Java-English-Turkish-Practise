package Test3;

public class Q10SwitchStaments {
    public static void main(String[] args) {

        int gunNo= 6;
        switch (gunNo){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("\"hafta sonu");
                break;

            default:
                System.out.println("gecersiz gun sayisi");
        }


    }
}
