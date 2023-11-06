package _StructuralPatterns.Decorator;

public class CizgiliReportDecorator extends RaporDecorator {

    public CizgiliReportDecorator(IReport report) {
        super(report);

    }

    @Override
    public String getMetin() {
        String metin = super.getMetin();

        String cizgiliMetin = RaporUtil.getCizgiliMetin(metin);
        return cizgiliMetin;
    }

}
