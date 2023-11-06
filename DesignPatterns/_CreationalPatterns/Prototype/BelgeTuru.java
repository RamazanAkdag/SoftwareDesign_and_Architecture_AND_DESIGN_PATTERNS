package DesignPatterns._CreationalPatterns.Prototype;

public class BelgeTuru {

    private long id;
    private String adi;

    public BelgeTuru() {

    }

    public BelgeTuru(long id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "BelgeTuru [ adi=" + adi + "]";
    }

}
