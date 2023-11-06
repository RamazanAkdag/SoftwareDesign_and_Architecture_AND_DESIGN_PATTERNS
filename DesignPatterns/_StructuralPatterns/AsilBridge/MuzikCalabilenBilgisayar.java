package DesignPatterns._StructuralPatterns.AsilBridge;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    void muzikCal(Muzik muzik) {
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);

    }
}
