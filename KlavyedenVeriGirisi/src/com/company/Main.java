package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* System.out.println("Enter your name:");

        String name="";
        Scanner scan=new Scanner(System.in);

        name=scan.nextLine();

        //next:klavyeden girilen ifadenin ilk kelimesini okur
        //findInLine(0)
        //nextInt(): klavyeden girilen değeri int çevirir
*/

       //Kullanıcıdan 3 sayı istenip bunların hangisi en büyük hangisi en küçük yazdırılsın
        int num1, num2, num3;
        String biggestNum="", smallestNum="";
        Scanner getData=new Scanner(System.in); // kullanıcıdan veri beklediğimizi söylemek için system.in yazılır.

        System.out.println("Enter the first number: ");
        num1=getData.nextInt();
        System.out.println("Enter the second number: ");
        num2=getData.nextInt();
        System.out.println("Enter the third number: ");
        num3=getData.nextInt();

        if (num1<num2 && num1 < num3){
            smallestNum="num1 is a smallest number: " + num1;
            if (num2<num3) {
                biggestNum="num3 is a biggest number: " + num3;
            }else {
                biggestNum="num2 is a biggest number: " + num2;
            }
        }else if (num2<num1 && num2 < num3){
            smallestNum="num2 is a smallest number: " + num2;
            if (num1<num3) {
                biggestNum="num3 is a biggest number: " + num3;
            }else {
                biggestNum="num1 is a biggest number: " + num1;
            }
        }else if (num3<num1 && num3 < num2){
            smallestNum="num3 is a smallest number: " + num3;
            if (num1<num2) {
                biggestNum="num2 is a biggest number: " + num2;
            }else {
                biggestNum="num1 is a biggest number: " + num1;
            }
        }
        System.out.println(smallestNum);
        System.out.println(biggestNum);
    }
}
