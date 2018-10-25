package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int user_choice=0;
        int firstNum, secondNum;

       /* while (user_choice != 5) {
            user_choice = MenuGoster();
        }*/
        for (;;){
            Scanner scan = new Scanner(System.in);
            user_choice = MenuGoster();

            if (user_choice==5)
                break;

            System.out.println("First number: ");
            firstNum = scan.nextInt();
            System.out.println("Second number: ");

            secondNum = scan.nextInt();



            switch (user_choice){
                case 1:
                    topla(firstNum,secondNum);
                    break;
                case 2:
                    fark(firstNum,secondNum);
                    break;
                case 3:
                    carpma(firstNum,secondNum);
                    break;
                case 4:
                    bolme(firstNum,secondNum);
                    break;
                case 5:
                    break;

            }

        }

    }

    public static void bolme(double firstNum, double secondNum) {

        System.out.println("Bölümü:" +(firstNum/secondNum));

    }

    public static void carpma(int firstNum, int secondNum) {

        System.out.println("Çarpımı:" +(firstNum*secondNum));

    }

    public static void fark(int firstNum, int secondNum) {

        System.out.println("Fark:" +(firstNum-secondNum));
    }

    public static void topla(int firstNum, int secondNum) {

        System.out.println("Toplam:" + (firstNum+secondNum));
    }

    public static int MenuGoster(){   //int yaparak choice return ile döndürülebilir.
        System.out.println("********MENU********");
        System.out.println("1- Toplamı bul");
        System.out.println("2- Farkını bul");
        System.out.println("3- Çarpımını bul");
        System.out.println("4- Bölümünü bul");
        System.out.println("5- Çıkış");

        Scanner scan = new Scanner(System.in);
        int choice=0;
        choice= scan.nextInt();

        return choice;

    }
}
