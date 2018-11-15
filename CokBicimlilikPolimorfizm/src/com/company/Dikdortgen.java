package com.company;

public class Dikdortgen extends GeometricSekil {

    private double en;
    private double boy;

    public Dikdortgen() {

        en=0;
        boy=0;
    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {

        if (en<0){
            this.en=0;
        }else {
            this.en = en;
        }
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        if (boy<0){
            this.boy=0;
        }else {
            this.boy = boy;
        }
    }

    @Override
    public double alanHesapla() {
        return en*boy;
    }
}
