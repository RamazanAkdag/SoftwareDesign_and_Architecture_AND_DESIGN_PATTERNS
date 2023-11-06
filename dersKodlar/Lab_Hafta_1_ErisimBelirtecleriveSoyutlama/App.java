package Lab_Hafta_1_ErisimBelirtecleriveSoyutlama;

public class App {
    public static void main(String[] args) {
        Calisan isci = new Isci(5);
        isci.setIsim("selami");
        Calisan muhendis = new Muhendis(5);
        muhendis.setIsim("Ahmet");

        MaasHesapla maasHesapla = new MaasHesapla();

        System.out.println(muhendis.getIsim() + " Muhendisin maasi : " + maasHesapla.hesapla(muhendis));
        System.out.println(isci.getIsim() + " Iscinin maasi : " + maasHesapla.hesapla(isci));
    }
}
