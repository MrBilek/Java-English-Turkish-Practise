package New_Course;

public class MinProjectPerfectNumber {
    public static void main(String[] args) {
        // Perfect number examples= 6 and 28

        //6- you can devide 1,2,3 and if you want to sum up the numbers =6
        //28 the same formula


        int number=28;
        int total=0;

        for (int i = 1; i <number ; i++) {

            if (number % i == 0) {
                total = total + i;
            }
        }

                if (total==number){
                    System.out.println("Perfect number");
                }else {
                    System.out.println("It isn't perfect number");
                }

            }

        }






