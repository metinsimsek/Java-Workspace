package com.company;

public class Ogrenci {
    private String isim;
    private String soyisim;
    private int yas;
    private int ogrenciNo;

    public Ogrenci() {
        isim = "Henüz girilmedi. ";
        soyisim = "Henüz girilmedi. ";
        yas=0;
        ogrenciNo =0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
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

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo<0) {
            this.ogrenciNo = 0;
        }else {
            this.ogrenciNo = ogrenciNo;
        }
    }

    public String getKimlikBİlgileri(){
        return "KimlikBİlgileri: Ismi:" + isim + " Soyisim:" + soyisim + " Yaş:" + yas + " OgrenciNo:" + ogrenciNo;
    }

    @Override
    public String toString() {
        return "KimlikBİlgileri: ToString: Ismi:" + isim + " Soyisim:" + soyisim + " Yaş:" + yas + " OgrenciNo:" + ogrenciNo;
    }


}
