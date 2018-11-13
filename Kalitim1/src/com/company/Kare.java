package com.company;

//Kare sınıfını GeometricSekil sınıfından türetirken, kalıtırken extends anahtar kelimesi kullanılır.
public class Kare extends GeometricSekil {

    //Üst sınıfta olan bir methodu Override ederek extends yani super sınıfın üzerine buradaki değeri yazmış oluruz.
    @Override
    public String toString() {
        return "Karenin bir kenarı: " + this.getBoy();
    }
}
