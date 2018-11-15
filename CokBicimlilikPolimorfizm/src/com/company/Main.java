package com.company;

public class Main {

    public static void main(String[] args) {

        /*Dikdortgen d1 = new Dikdortgen(5,7);
        System.out.println(d1.alanHesapla());

        Kare k1 = new Kare(6);
        System.out.println(k1.alanHesapla());*/

        GeometricSekil gs1= new GeometricSekil();
        Kare k1 = new Kare(9);
        Dikdortgen d1 = new Dikdortgen(6,11);

        sekilAlanları(gs1);
        sekilAlanları(k1);
        sekilAlanları(d1);

    }

    //Bu methoda gönderilen kare ve dikdortgen nesneleri biçim değiştirip
    //Geometricsekil sınıfının bir nesnesi gibi davranırlar.
    public static void sekilAlanları(GeometricSekil sekil){

        System.out.println("Alan bilgisi:" + sekil.alanHesapla());
    }
}
