package Kalitim3;

public class Main {

    public static void main(String[] args) {

        Personel p1 = new Personel("Ali", "Veli", 32);
        System.out.println(p1.getKimlikBİlgileri());

        Ogrenci o1 = new Ogrenci("Ayşe", "Fatma", 35, 5423);
        System.out.println(o1.getKimlikBİlgileri());

    }
}
