package _StructuralPatterns.Decorator;

public class FreeReport implements IReport {
    private String metin;

    public FreeReport(String metin) {
        this.metin = metin;
    }

    @Override
    public String getMetin() {
        return this.metin;
    }

}
