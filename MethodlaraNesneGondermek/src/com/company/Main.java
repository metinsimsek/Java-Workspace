package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int toplam = topla(a,b);
        System.out.println("Toplam değeri: " + toplam);
        System.out.println(""+ aDegiskeniniYazdir(a));

        System.out.println("a degiskeninin degeri:" + a);

        Dikdortgen d1 = new Dikdortgen(60,90);
        System.out.println("Methoddan önce en:" + d1.getEn() + " boy:" + d1.getBoy() );

        yeniDikdortgenDegerleri(d1);

        System.out.println("Methoddan sonra en:" + d1.getEn() + " boy:" + d1.getBoy() );

    }

    private static void yeniDikdortgenDegerleri(Dikdortgen d1) {
        d1.setEn(70);
        d1.setBoy(80);
    }

    private static int aDegiskeniniYazdir(int a) {
        return a+10;
    }

    private static int topla(int a, int b) {
        return (a+10) + (b+5);
    }
}
