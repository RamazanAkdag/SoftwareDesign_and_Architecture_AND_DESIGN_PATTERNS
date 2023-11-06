package DesignPatterns._CreationalPatterns.FactoryMethod;

public class S8 implements Telefon {
    private String Model;
    private String Batarya;
    private int En;
    private int Boy;

    public S8(String model, String batarya, int en, int boy) {
        Model = model;
        Batarya = batarya;
        En = en;
        Boy = boy;
    }

    @Override
    public String getModel() {
        return this.Model;
    }

    @Override
    public String getBatarya() {
        return this.Batarya;
    }

    @Override
    public int getEn() {
        return this.En;
    }

    @Override
    public int getBoy() {
        return this.Boy;
    }

    @Override
    public String toString() {
        return "S8 [Model=" + Model + ", Batarya=" + Batarya + ", En=" + En + ", Boy=" + Boy + "]";
    }

}
