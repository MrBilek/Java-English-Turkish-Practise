package Test3;

public class Q9switchStatements {
    public static void main(String[] args) {

        int gunNo= 6;

        switch (gunNo){

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
                case 3:
                System.out.println("carsamba");
                break;
                case 4:
                System.out.println("persembe");
                break;case 5:
                System.out.println("cuma");
                break;
                case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("gecersiz gun sayisi");
        }

    }
}
