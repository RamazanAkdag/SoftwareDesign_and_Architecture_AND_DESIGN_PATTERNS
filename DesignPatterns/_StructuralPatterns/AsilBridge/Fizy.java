package DesignPatterns._StructuralPatterns.AsilBridge;

public class Fizy implements MuzikCalar {

    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy" + muzik + "şarkısını çalıyor");
        return muzik.getSes();
    }

}
