package com.company;

public class Main {

    public static void main(String[] args) {

        String takim="Galatasaray";
        String takim2=new String("Galatasaray");

        System.out.println("Harf Sayısı : " + takim.length());
        System.out.println("4. karakteri : " + takim.charAt(4));
        System.out.println(takim.substring(2,6));
        System.out.println(takim.indexOf('s'));
        System.out.println(takim.lastIndexOf('a'));
        System.out.println(takim.replace('G', 'S'));
        System.out.println(takim.toUpperCase());
        System.out.println(takim.toLowerCase());

        String year = "1905";
        System.out.println(Integer.parseInt(year)-5);  //String olan bir ifadeyi integer yapmak için

        int year2=1905;
        String years=String.valueOf(year2);  // Integer olan bir ifadeyi String yapmak için
        System.out.println(years);


        String s1 = new String("metin");
        String s2 = new String("metin2");

        if (s1.equals(s2)){
            System.out.println("Eşitler");
        }else
            System.out.println("Değiller");

    }
}
