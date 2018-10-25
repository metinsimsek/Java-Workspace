package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1-) 3 farklı isim tutan bir string tanımla
        // 2-) 3 farklı soyisim tutan bir string tanımla
        // 3-) combine() isimli bir method oluşturun ve bu method bu isim ve soyisimleri birleştirsin ve de her birine 50 ye kadar rastgele bir yaş değeri atasın
        // 4-) Bu method birleştirdiğiniz isimleri bir arrayList içinde tutsun ve bunu geriye döndürsün
        // 5-) yazdır() methodu bu dönen arrayListi gelişmiş for döngüsü ile yazdırsın

        String names[]= {"Ali", "Veli", "Selami"};
        String surnames[] ={"Simsek", "Yilmaz", "Güler"};

        /*ArrayList<String> allCombaneNames = combine(names,surnames);
        System.out.println(allCombaneNames.size());
        */

        ArrayList<String> allCombaneNames = new ArrayList<>();
        allCombaneNames = combine(names,surnames);
        //System.out.println(allCombaneNames.size());

        yazdir(allCombaneNames);

    }

    public static void yazdir(ArrayList<String> allCombaneNames) {

        for (String temp : allCombaneNames){
            System.out.println(temp);
        }
    }

    public static ArrayList<String> combine(String[] name, String[] surname){

        ArrayList<String> allnames= new ArrayList<>();


        for (int i=0; i<name.length; i++){

            int randomAgeNum = (int) (Math.random() * 50);
            String combaneName= name[i] + " " + surname[i] + " " + randomAgeNum;
            //System.out.println("Sonuc: " + combaneName);

            allnames.add(combaneName);
        }

        return allnames;

    }
}
