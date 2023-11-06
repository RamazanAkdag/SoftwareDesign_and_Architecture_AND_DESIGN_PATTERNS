package Lab_Hafta_1_ErisimBelirtecleriveSoyutlama;

public class MaasHesapla {

    public int hesapla(Calisan calisan) {
        return calisan.getSaat() * calisan.getSaatBasiUcret();
    }

}
