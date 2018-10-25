package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(-5)); //girilen sayının mutlak değerini verir
        System.out.println(Math.ceil(9.3)); //verilen sayıyı bir üst sayıya yuvarlar

        System.out.println(Math.floor(9.3)); //verilen sayıyı bir üst sayıya yuvarlar
        System.out.println(Math.pow(2,3)); //verilen sayıları kuvveti şeklinde hesaplar

        System.out.println(Math.sqrt(16)); //verilen sayınun karekökünü verir
        System.out.println(Math.max(11,14)); //girilen sayıların en büyüğünü veirr
        System.out.println(Math.min(7,4)); //girilen sayıların en küçüğünü verir

        System.out.println(Math.random() * 50); //0 ile 1 arasında bir sayı üretir
        System.out.println((int) (Math.random() * 50)); // 0 ile 50 arasında int bir sayı üretir
*/

       /* // Dik kenarları x olan ikizkenar bir üçgenin alanı

        int edge=1;
        double area=0;

        Scanner getData=new Scanner(System.in);
        System.out.println("Enter the edge: ");
        edge = getData.nextInt();

        area = Math.pow(edge,2) / 2;
        System.out.println(area);
*/

        //0 ile 50 arasında rastgele üretilen iki sayının önce büyüğünü sonra küçüğünü ekrana yazdır

        int x,y;

            x=(int) (Math.random() * 50);
            y=(int) (Math.random() * 50);

        System.out.println("Biggest one: " + Math.max(x,y) + "\nSmallest one: " + Math.min(x,y));

    }
}
