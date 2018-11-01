package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Olusturulan cemberdaire nesne sayisi:" + CemberDaire.getOluşturulanNesneSayisi());
        CemberDaire d1 = new CemberDaire();
        d1.setYariçap(6);

        System.out.println("Olusturulan cemberdaire nesne sayisi:" + CemberDaire.getOluşturulanNesneSayisi());
        CemberDaire d2 = new CemberDaire();

        System.out.println("Olusturulan cemberdaire nesne sayisi:" + CemberDaire.getOluşturulanNesneSayisi());

        CemberDaire d3 = new CemberDaire();
        d3.setYariçap(10);
        System.out.println("d3'ün cevresi: " + d3.cevreHesapla());
        System.out.println("d3'ün alani: " + d3.alaniHesapla());




    }
}
