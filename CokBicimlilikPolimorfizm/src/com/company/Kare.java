package com.company;

public class Kare extends GeometricSekil {

    private double kenar;

    public Kare() {
        kenar=0;
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        if (kenar<0){
            this.kenar=0;
        }else {
            this.kenar = kenar;
        }
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }
}
