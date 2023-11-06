package Lab_Hafta_1_ErisimBelirtecleriveSoyutlama;

public abstract class Calisan {
    protected int saat;
    protected int saatBasiUcret;
    protected String isim;

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getSaatBasiUcret() {
        return saatBasiUcret;
    }

    public void setSaatBasiUcret(int saatBasiUcret) {
        this.saatBasiUcret = saatBasiUcret;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
