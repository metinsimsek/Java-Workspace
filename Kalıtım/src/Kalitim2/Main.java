package Kalitim2;

public class Main {

    public static void main(String[] args) {

        Personel ali = new Personel("Ali", "Tuncer", 25 );
        System.out.println(ali.getKimlikBİlgileri());

        Ogrenci ebru = new Ogrenci("Ebru", "Uzumcu", 25, 1494 );
        System.out.println(ebru.getKimlikBİlgileri());
        System.out.println(ebru.toString());
        System.out.println(ali.toString());



    }
}
