package DesignPatterns._CreationalPatterns.Builder;

public class Emlakci {
    public static void main(String[] args) {

        Ev ev1 = new Ev("İstanbul", "Kadıköy", "Moda", 1990, 3, 2, 1, 2, false, true, true, false, false, false);

        // İkinci Ev örneği oluşturuluyor
        Ev ev2 = new Ev("Ankara", "Çankaya", "Kavaklıdere", 2005, 4, 3, 2, 3, true, false, true, true, true, true);

        PrintEv(ev1);
        PrintEv(ev2);

    }

    private static void PrintEv(Ev ev) {
        System.out.println();
        System.out.println("Ev eklendi -> " + ev);
        System.out.println();
    }
}
