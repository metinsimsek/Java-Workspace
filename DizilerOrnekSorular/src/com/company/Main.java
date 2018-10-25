package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /*  // 10 elemanlı bir diziye eleman olarak dizi indexlerinin karelerini atayan bir uygulama

        int[] firstSeries = new int[10];
        for (int i=0;i<firstSeries.length;i++){
            firstSeries[i] = i * i;
            System.out.println("Indeks : " + i + " degeri: " + firstSeries[i]);
        }*/

       /* //Kullanıcıdan alınan 5 sayıyı diziye atayan ve sonunda alınan değerleri ekrana yazdıran uygulama

        int enterenceNum=0;
        Scanner scan = new Scanner(System.in);
        int[] enterenceNumbers=new int[5];
        for (int i=0; i<enterenceNumbers.length;i++){

            System.out.println("Tam sayi giriniz:");
            enterenceNum=scan.nextInt();
            enterenceNumbers[i]=enterenceNum;

        }
        for (int i=0;i<enterenceNumbers.length;i++){
            System.out.println("Girilen sayı numarası: " + (i+1) + " Değeri:" + enterenceNumbers[i]);
        }*/

       /*// Kullanıcı yılın hangi ayı olduğunu girince ay değerini yazdırın
       // Eğer 1 ile 12 dışında bir değer girilirse hata versin

        String[] months = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim",
                            "Kasım", "Aralık"};

        int enterenceMonth;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz(1-12):");
        enterenceMonth=scan.nextInt();

        if (enterenceMonth>0 && enterenceMonth<=12){

            System.out.println("Girilen ay: " + months[enterenceMonth-1]);
        }else {
            System.out.println("Hata");
        }*/

       // Boyutu dışarıdan girilen bir dizinin , elemanlarının değerlerini toplayan uygulama

        int diziElemanSayisi, toplam=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç elemanlı dizi gerekiyor?");
        diziElemanSayisi=scan.nextInt();

        int[] girilenSayilar=new int[diziElemanSayisi];

        for (int i=0;i<girilenSayilar.length;i++){

            System.out.println("Enter the number:");
            girilenSayilar[i]= scan.nextInt();
            toplam=toplam+girilenSayilar[i];
        }

        System.out.println("Dizideki eleman sayısı toplamı:" + toplam);


    }
}
