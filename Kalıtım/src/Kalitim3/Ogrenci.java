package Kalitim3;

public class Ogrenci extends Personel {

    private int ogrenciNo;

    public Ogrenci (){

        super();
        ogrenciNo=0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        super(isim, soyisim, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {

        if (ogrenciNo < 0){
            this.ogrenciNo=0;
        }else {
            this.ogrenciNo = ogrenciNo;
        }
        this.ogrenciNo=ogrenciNo;
    }

    @Override
    public String getKimlikBİlgileri() {
        return super.getKimlikBİlgileri() + " Ogrenci No:" + ogrenciNo;
    }
}
