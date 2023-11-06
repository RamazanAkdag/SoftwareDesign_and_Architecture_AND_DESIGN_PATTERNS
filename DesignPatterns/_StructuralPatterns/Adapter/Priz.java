package DesignPatterns._StructuralPatterns.Adapter;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri) {
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("prizden " + volt + " alınıyor");
    }
}
