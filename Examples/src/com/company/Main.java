package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Klavyeden girilen 3 sayının ortalaması

       /* double num1, num2, num3;
        double averagenum;
        Scanner getData=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1=getData.nextInt();
        System.out.println("Enter the second number: ");
        num2=getData.nextInt();
        System.out.println("Enter the third number: ");
        num3=getData.nextInt();

        averagenum= (num1 + num2 + num3)/3;
        System.out.println("Average of the numbers: " + averagenum);
*/
       /*//Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulama

        int edge1, edge2, edge3;

        Scanner getData=new Scanner(System.in);

        System.out.println("Enter the first edge: ");
        edge1=getData.nextInt();
        System.out.println("Enter the second edge: ");
        edge2=getData.nextInt();
        System.out.println("Enter the third edge: ");
        edge3=getData.nextInt();


        if ((edge1*edge1)+(edge2*edge2)==edge3*edge3) {
            System.out.println("This is special triangle");
        }else
            System.out.println("This is not a special triangle");
*/

       /*//Klavyeden girilen vize ve final notlarına göre öğrencinin dersi geçip geçmediğini  söyleyen uygulama
        // (Geçme notu 50, vizenin %40'ı, finalin %60'si geçerlidir.)


        int num1, num2;
        double midPoint, finalPoint, result;

        Scanner getData=new Scanner(System.in);

        System.out.println("Enter the midterm result:");
        num1=getData.nextInt();
        System.out.println("Enter the final result:");
        num2=getData.nextInt();

        midPoint = (40d / 100d) * num1;
        finalPoint= (60d / 100d) * num2;
        result= midPoint+finalPoint;

        if (result>=50){
            System.out.println("Your final result is " + result +"\nYou past the exam");
        }else
            System.out.println("Your final result is " + result + "\nYou failed");
*/

       /* //Kendi adınızı ekrana 5 kere yazdıran uygulama

        for (int i = 1; i <= 5; i++) {

            System.out.println("Metin");
        }
*/

        // 1'den 100'e kadar olan sayıların toplamını veren uygulama

       /* int a=1, total=0;
        while (a<100){
            total=total+a;
            a++;
        }
        System.out.println("Sum of the total numbers " + total);
*/

      /* // 1'den 100'e , 100'den 1'e olan sayıları sıra ile ekrana yazdıran uygulama

        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        for (int j=100;j>0;j--){
            System.out.println(j);
        }
*/

      /*// Klavyeden girilen bir sayının faktöriyelini alan bir uygulama

        int num, factoriyel=1;

        Scanner getData=new Scanner(System.in);
        System.out.println("Enter the number:");
        num =getData.nextInt();

        for (int i=2;i<=num;i++){
            factoriyel=factoriyel*i;
        }
        System.out.println(num+" sayısının faktöriyeli = "+factoriyel);
*/

     /* // Klavyeden girilen x ve y değerlerini hesaplayınız.
        // x>0, y<0 ise f(x,y)= 4x+2y+4
        // x>0, y=0 ise f(x,y)= 2x-y+3
        // x<0, y>0 ise f(x,y)= 3x+4y+3

        int x,y;

        int function=0;

        Scanner getData=new Scanner(System.in);
        System.out.println("Enter the x:");
        x =getData.nextInt();
        System.out.println("Enter the y:");
        y =getData.nextInt();

        if (x>0 && y<0){
            function=4*x+2*y+4;
            System.out.println("f(x,y)="+function);
        }else if (x<0 && y>0){
            function=3*x+4*y+3;
            System.out.println("f(x,y)="+function);
        }else if ((x > 0) && (y == 0)) {
            function=2*x-y+3;
            System.out.println("f(x,y)="+function);
        }else
            System.out.println("Fonksiyonlara uygun değer giriniz.");
*/

       /* // 100'lük sistemde verilen notları harfli sistemde gösteren uygulama

        int value=0;

        Scanner getData=new Scanner(System.in);
        System.out.println("Enter the grade:");
        value =getData.nextInt();

        if (value>=90 && value==100){
            System.out.println("AA");
        }else if (value>=80 && value<90){
            System.out.println("BA");
        }else if (value>=70 && value<80){
            System.out.println("BB");
        }else if (value>=60 && value<70){
            System.out.println("CB");
        }else if (value>=50 && value<60){
            System.out.println("CC");
        }else
            System.out.println("FF");
*/

       /* //Çarpım tablosunu oluşturan bir uygulama

        int num1,num2;

        for (num1=1;num1<=10;num1++){
            for (num2=1;num2<=10;num2++){
                System.out.print(num1 + "*" + num2 + "=" + (num1*num2) + "\t");
            }
            System.out.println();
            System.out.println();
        }
*/
    }
}
