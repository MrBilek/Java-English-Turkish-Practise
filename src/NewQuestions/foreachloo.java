package NewQuestions;

public class foreachloo {

    public static void main(String[] args) {

        Integer []arr= {3,2,5,6,7};

        for (int each:arr
             ) {
            System.out.print(each+" ");//3 2 5 6 7

        }
        System.out.println("");

int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;
        }

        System.out.println("sayilarin toplami:"+toplam);

    toplam=0;

        for (int each:arr
         ) {
            toplam+=each*each;
        }

        System.out.println("sayilarin karesi :"+toplam);

    }
}
