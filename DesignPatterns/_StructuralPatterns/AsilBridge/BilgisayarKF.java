package DesignPatterns._StructuralPatterns.AsilBridge;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();

    }

    @Override
    void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar KF çalıştı");
        super.muzikCal(muzik);
    }

}
