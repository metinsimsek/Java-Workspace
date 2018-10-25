package com.company;

public class Main {

    public static void main(String[] args) {

    MenuGoster();
    toplaminiBul(4,5);
    int fark= farkiniBul(10, 5);
        System.out.println(fark);


    }

    public  static void MenuGoster(){

        System.out.println("MENU");
        System.out.println("First Page");
        System.out.println("Second Page");
        System.out.println("Third Page");
    }
    public static void toplaminiBul(int x, int y){

        int toplam= x + y;
        System.out.println(toplam);
    }
    public static int farkiniBul(int a, int b){  // int için geriye return döndürülmesi gerekli

        int fark=a-b;

        return fark;
    }

}
