package com.company;

public class Main {

    public static void main(String[] args) {

        Personel mehmet = new Personel("Mehmet", "Yıldız", 30 );
        System.out.println(mehmet.getKimlikBİlgileri());
        System.out.println(mehmet.toString());

        Ogrenci ebru = new Ogrenci("Ebru", "Uzumcu", 28, 1494 );
        System.out.println(ebru.getKimlikBİlgileri());
        System.out.println(ebru.toString());



    }
}
