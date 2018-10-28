package com.company;

public class Main {

    public static void main(String[] args) {

        Araba sahin = new Araba();
        sahin.setYear(2030);
        System.out.println(sahin.getYear());

        //Bellekte araba ile alakalı tüm bilgileri tutacak şekilde bir alan ayrılır. Serce adı altında bir referans olur.
        //Araba sınıfı, serce nesnesi
        Araba serce = new Araba();
        serce.setColor("red");
        serce.setName("crazy");
        serce.setBeygirGucu(150);
        System.out.println(serce.getColor());
        }
}
