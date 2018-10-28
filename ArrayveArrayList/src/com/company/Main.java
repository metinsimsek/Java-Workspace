package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // küçükten büyüğe dizi elemanlarını sıralar
        int[] dizi = {3,5,8,5,7,2};

        Arrays.sort(dizi);

        for (int i : dizi){
            System.out.println(i);
        }

        //dizileri karşılaştır
        int[] dizi2 = {3,5,8,5,7,2};
        Arrays.sort(dizi2);
        System.out.println(Arrays.equals(dizi, dizi2));


        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(5);  //Eleman ekler
        liste.add(7);
        liste.add(3);

        ArrayList<Float> liste2=new ArrayList<>();
        liste2.add(5f);

        liste.remove(1);  // index i verilen eleman listeden çıkartılır

        for (int i : liste){
            System.out.println(i);
        }

        liste2.clear(); // listedeki tüm elemanları siler

        liste.indexOf(2); // Listede 2 var ise onun indexini yoksa -1 döndürür.

        System.out.println(liste.indexOf(3));

    }
}
