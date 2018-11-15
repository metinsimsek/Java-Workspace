package Kalitim2;

public class Personel {

    private String isim;
    private String soyisim;
    private int yas;

    public Personel(){

        isim = "Henüz girilmedi. ";
        soyisim = "Henüz girilmedi. ";
        yas = 0;
    }
    public Personel(String isim, String soyisim, int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0) {
            this.yas = 0;
        }else {
            this.yas = yas;
        }
    }
    public String getKimlikBİlgileri(){
        return "KimlikBİlgileri: Ismi:" + isim + " Soyisim:" + soyisim + " Yaş:" + yas;
    }

    @Override
    public String toString() {
        return "KimlikBİlgileri: ToString: Ismi:" + isim + " Soyisim:" + soyisim + " Yaş:" + yas;
    }
}
