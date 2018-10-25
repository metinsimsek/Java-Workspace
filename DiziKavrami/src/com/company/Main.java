package com.company;

public class Main {

    public static void main(String[] args) {

        // veritipi[]  diziadi = new veritipi[eleman sayisi];
        int[] sayilar = new int[5];

        sayilar[0] = 10;
        sayilar[1] = 5;

        for (int i=0;i<sayilar.length;i++){

            System.out.println(sayilar[i]);
        }

        int[] newSeries = {10,20,30,40,50};
        for (int j=0; j<newSeries.length;j++){
            System.out.println("Index degeri:" + j + " newSeries: " + newSeries[j]);
        }
    }
}
