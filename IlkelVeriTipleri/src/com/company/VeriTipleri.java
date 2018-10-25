package com.company;

public class VeriTipleri {

    public static void main(String[] args) {

        int firstNum = 10;
        int secondNum = 20;

        System.out.println(firstNum+secondNum);

        //Tam sayilar, byte, short, int ve long

        System.out.println("Byte en küçük:" + Byte.MIN_VALUE + " Byte en büyük:" + Byte.MAX_VALUE + " BIT SAYISI:" + Byte.SIZE );

        System.out.println("Short en küçük:" + Short.MIN_VALUE + " Short en büyük:" + Short.MAX_VALUE + " Short SAYISI:" + Short.SIZE );

        System.out.println("Integer en küçük:" + Integer.MIN_VALUE + " Integer en büyük:" + Integer.MAX_VALUE + " Integer SAYISI:" + Integer.SIZE );

        System.out.println("Long en küçük:" + Long.MIN_VALUE + " Long en büyük:" + Long.MAX_VALUE + " Long SAYISI:" + Long.SIZE );


        //Ondalıklı veri tipleri float ve double

        System.out.println("Float en küçük:" + Float.MIN_VALUE + " Float en büyük:" + Float.MAX_VALUE + " Float SAYISI:" + Float.SIZE );

        System.out.println("Double en küçük:" + Double.MIN_VALUE + " Double en büyük:" + Double.MAX_VALUE + " Double SAYISI:" + Double.SIZE );


        double ondalikliSayi = 5.6324325324d;
        float ondaliSayi =5.233546523f;

        System.out.println(ondaliSayi);
        System.out.println(ondalikliSayi);


        //Diğer veri tipleri char ve boolean

        char firstLetter= 'A';

        boolean sonuc = true;
        boolean sonucc =  false;






    }
}
