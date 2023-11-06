package Lab_Hafta_2_CokBicimlilikveEncapsulation;

public class Kullanici {

    private String isim;
    private int yas;

    public Kullanici(String isim, int yas) {// doğru constructor böyle yazılır

        if (!this.setIsim(isim)) {
            setIsim("isimsiz");
        }
        this.setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public boolean setIsim(String isim) {// yeni teknik. Bu sayede atama yapılırken bir sıkıntı mı oldu bunu kontrol
                                         // edebiliriz
        if (isim.length() < 30) {
            this.isim = isim;
            return true;
        }
        return false;

    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

}
