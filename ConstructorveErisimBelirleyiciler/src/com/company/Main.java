package com.company;

public class Main {

    public static void main(String[] args) {

        //sınıfımızı oluşturduk şimdi de nesne üretmemiz lazım

        Dikdortgen d1 = new Dikdortgen();
        d1.setEn(5);
        d1.setBoy(10);
        System.out.println("d1 Alanı:" + d1.alaniHesapla());

        //constructor(kurucu method) altındaki en değerini aldı.
        Dikdortgen d2 = new Dikdortgen();
        d2.setBoy(15);
        System.out.println("d2 Alanı:" + d2.alaniHesapla());

        Dikdortgen d3 = new Dikdortgen(5,9);
        System.out.println("d3 Alanı:" + d3.alaniHesapla());

        Dikdortgen d4 = new Dikdortgen(9);
        d4.setEn(4);
        System.out.println("d4 Alanı:" + d4.alaniHesapla());





    }
}
