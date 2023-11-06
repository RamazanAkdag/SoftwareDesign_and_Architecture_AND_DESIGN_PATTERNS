package _StructuralPatterns.Decorator;

public abstract class RaporDecorator implements IReport {

    private IReport report;

    public RaporDecorator(IReport report) {
        this.report = report;
    }

    @Override
    public String getMetin() {

        return report.getMetin();
    }

}
