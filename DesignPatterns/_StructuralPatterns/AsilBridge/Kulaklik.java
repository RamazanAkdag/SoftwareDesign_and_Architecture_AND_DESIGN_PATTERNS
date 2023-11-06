package DesignPatterns._StructuralPatterns.AsilBridge;

public class Kulaklik implements SesCihazi {

    @Override
    public void sesiCal(String ses) {
        System.out.println("Kulaklik ses çalıyor -> " + ses);
    }

}
