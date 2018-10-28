package com.company;

public class Dikdortgen {

    //private olarak kullanılması encapsulation demektir.
    private double en;
    private double boy;

    //sınıfın adıyla birebir aynı olup geriye herhangi bir değer döndermeyen methodlara constructor(kurucu method) denir.
    public Dikdortgen(){

        en = 11;
    }

    public Dikdortgen(double en, double boy){
        this.en = en;
        this.boy = boy;
    }

    public Dikdortgen(double boy){
        this.boy=boy;
    }


    public double alaniHesapla(){

        return en * boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
