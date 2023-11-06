package _StructuralPatterns.AsilBridge.BridgeDeneme;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse Hadi Gülümse...");

        Bilgisayar bilgisayar = new Bilgisayar();

        bilgisayar.muzikCal(muzik);
    }
}
