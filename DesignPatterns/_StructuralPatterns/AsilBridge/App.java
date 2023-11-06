package DesignPatterns._StructuralPatterns.AsilBridge;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse Hadi Gülümse...");

        BilgisayarKF bilgisayar = new BilgisayarKF();

        bilgisayar.muzikCal(muzik);
    }
}
