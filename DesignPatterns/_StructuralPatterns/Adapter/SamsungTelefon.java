package DesignPatterns._StructuralPatterns.Adapter;

public class SamsungTelefon implements Telefon {
    private int calismaVoltaji;

    public SamsungTelefon() {
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("samausng telefon çalışıyor");
        return calismaVoltaji;
    }

}
