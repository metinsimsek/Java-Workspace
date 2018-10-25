package com.company;

public class Main {

    public static void main(String[] args) {

        /*int sayi1 = 5 / 3;
        float sayi2 = 5f / 3f;
        double sayi3 = 5d / 3d;

        System.out.println("sayı 1:" + sayi1 + "\nsayı 2:" + sayi2 + "\nsayı 3:" +sayi3);

        int a = 10;
        float b = 3.23f;
        double c = 15.15d;

        *//*
        //casting
        a = (int) b;
        System.out.println(a);

        b=a;
        System.out.println(b);
        *//*

        b=(float) c;
        System.out.println(b);
*/

        //valueOf, parse

        String s1 = "12";
        String s2 = "20";

        System.out.println(s1+s2);

        int a1 = Integer.valueOf(s1);
        int a2 = Integer.parseInt(s2);

        System.out.println(a1+a2);


        int b1 =80;
        int b2 =90;

        System.out.println(b1+b2);

        String t1 = String.valueOf(b1);
        String t2 = String.valueOf(b2);

        System.out.println(t1+t2);

    }
}
