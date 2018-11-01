package com.company;

public class CemberDaire {

    private double yariçap;
    public final double pi=3.14;
    private static int oluşturulanNesneSayisi;

    public CemberDaire(){
        System.out.println("Cemberdaire nesnesi oluşturuluyor.");
        oluşturulanNesneSayisi ++;
    }
    public static int getOluşturulanNesneSayisi(){
        return oluşturulanNesneSayisi;
    }

    public void setYariçap(double yariçap){
        if (yariçap >=1) {
            this.yariçap = yariçap;
        } else
            this.yariçap = 1;
    }
    public double getYariçap(){
        return yariçap;
    }
    public double cevreHesapla(){
        return 2 * pi * yariçap;
    }
    public double alaniHesapla(){
        return pi * yariçap * yariçap;
    }
}
