package _StructuralPatterns.Decorator;

public class kucukRaporDecorator extends RaporDecorator {
    private int genislik;

    public kucukRaporDecorator(IReport report) {
        super(report);
        this.genislik = 30;

    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        String kucukMetin = RaporUtil.metniSigdir(metin, genislik);

        return metin;
    }

}
