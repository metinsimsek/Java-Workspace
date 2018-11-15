package Kalitim2;

public class Ogrenci extends Personel {

    private int ogrenciNo;

    public Ogrenci() {
        // Personel class ına extends ettiğimiz için oradaki parametreleri get ve set kullanarak çağırırız.
        setIsim("Henüz girilmedi.");
        setSoyisim("Henüz girilmedi.");
        setYas(0);
        ogrenciNo=0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        setIsim(isim);
        setSoyisim(soyisim);
        setYas(yas);
        this.ogrenciNo=ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String getKimlikBİlgileri() {
        return "KimlikBİlgileri: Ismi:" + getIsim() + " Soyisim:" + getSoyisim() + " Yaş:" + getYas() + " OgrenciNo:" + getOgrenciNo();
    }
}
