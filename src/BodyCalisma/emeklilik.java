package BodyCalisma;

import java.util.Scanner;

public class emeklilik {
    public static void main(String[] args) {
   /*

                Scanner scan = new Scanner(System.in);
                System.out.print("Lütfen yaşınızı girin: ");
                int age = scan.nextInt();

                if (age >= 65) {
                    System.out.println("Emekli olabilirsin!");
                } else {
                    int yearsUntilRetirement = 65 - age;
                    System.out.println("Emekli olmak için hala " + yearsUntilRetirement + " yıl çalışmanız gerekiyor.");
                }
            }
        }
/*

     }
     }
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasınızı girin");

        int girilenYas = scan.nextInt();
        int kalanYil = 65 - girilenYas;

        if (girilenYas >= 65) {
            System.out.println("Emekli olabilirisin");




            }else System.out.println(  ""+ (kalanYil) + " yil sonra emekli olabilirsin");


        }

    }
