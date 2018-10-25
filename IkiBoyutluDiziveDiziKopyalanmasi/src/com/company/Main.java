package com.company;

public class Main {

    public static void main(String[] args) {

        //Dizi Kopyalama
        int[] dizi1 = {1,3,5,7};
        int[] dizi2 = new int[dizi1.length];

        for (int i=0;i<dizi1.length;i++){
            dizi2[i]=dizi1[i];
        }

        System.out.println("Klasik for ile kopyalama");
        for (int i :dizi2){
            System.out.println(i);
        }

        //arraycopy kkullanımı
        //system.arraycopy(dizi1, başlangıç, dizi2, başlangıç, uzunluk);

        int[] dizi3 = new int[dizi1.length];

        System.out.println("Arraycopy methodu ile kopyalama");
        System.arraycopy(dizi1, 0, dizi3,0,4);

        for (int gecici : dizi3){
            System.out.println(gecici);
        }





      /*  //veritipi[][] diziAdi=new veritipi [satır sayısı][sutun sayısı]

        int[][] numbers=new  int[2][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;


        int [][] n = {{1,2}, {3,4}, {5,6}};
        System.out.println(n[1][1]);


        // 5 satır ve 4 sütundan oluşan bir diziye rastgele(1-100) sayılar atayan bir uygulama

        int [][] table = new int [5][4];

        for (int satir=0; satir < table.length; satir++){
            for (int sutun=0; sutun < table[satir].length; sutun++ ){

                table[satir][sutun] = (int) (Math.random()*100);
            }
        }
        for (int satir=0; satir < table.length; satir++) {
            for (int sutun = 0; sutun < table[satir].length; sutun++) {
                System.out.print(table[satir][sutun] + " ");
            }
            System.out.println();
        }
        */

    }
}
