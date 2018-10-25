package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers={1,3,6,8};
        int[] yeniDizi={6,43,6,-65,32,-465};
        ekranaYazdir(numbers[2]);
        elemanlarinToplaminiBul(numbers);
        elemanlarinToplaminiBul(yeniDizi);

        //parametre sayısını bilmediğimiz methodlar için
        toplaminiBul(5,9,54,23);

    }

    private static void elemanlarinToplaminiBul(int[] gelenDizi) {

        int total=0;

        for (int gecici : gelenDizi){
            total = total + gecici;
        }
        System.out.println("Dizi elemanlarının toplamı: " + total);
    }

    private static void ekranaYazdir(int number) {

        System.out.println(number);
    }

    private static void toplaminiBul(int... sayilar){  //istenilen kadar sayı yazılabilir, bu dizi olarak gösterilir

        int total=0;
        for (int num : sayilar){
            total=total+num;
        }
        System.out.println("Toplam: " + total);


    }


    // for each yani gelişmiş for döngüsü örnekleri
        /*
        int[] numbers={1,2,5,7,8,9};

        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // for each yani gelişmiş for döngüsü
        for (int gecici : numbers){
            System.out.println(gecici);
        }

        int[] dizi ={1,5,7,9,-32,-12,40};
        int total=0;

        for (int i : dizi){
            total=total + i;
        }
        System.out.println("Elemanların toplamı: " + total);


        //Haftanın günlerini tutan diziyi for each ile ekrana yazdır

        String[] daysOfWeek ={"Pzrt", "Salı", "Çarş", "Perş", "Cuma", "Cumrt", "Pazar"};
        for (String days : daysOfWeek){
            System.out.println(days);
        }
*/


}
