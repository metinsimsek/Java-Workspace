package com.company;

public class Main {

    public static void main(String[] args) {

      /*  int num =1;
        // koşul doğru olduğu sürece while çalışır
        while (num<=10){

            //System.out.println(num);
            num++;
        }
*/
        int a=1, total=0;
        while (a<=10){

            total=total+a;
            a++;
        }
        System.out.println("Total of the numbers: " + total);


       /* int x=1;
        // do nun içi en az 1 kere çalıştırılmalı.
        do {
            System.out.println(x);
            x++;
        }while (x<=10);
*/

       /*for (int i=1;i<=100;i+=2){
           System.out.println(i);
       }

       //1'den fazla değişken için
       for (int a=5, b=6; a*b<100; a++, b+=3){
           System.out.println("first value of a: " + a);
           System.out.println("first value of b: " + b);
           System.out.println(a*b);
       }*/
    }
}
