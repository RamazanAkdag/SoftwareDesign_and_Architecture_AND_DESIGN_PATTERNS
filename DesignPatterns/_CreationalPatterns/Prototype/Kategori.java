package DesignPatterns._CreationalPatterns.Prototype;

public class Kategori {

    private long id;
    private String adi;

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
        return "Kategori [adi=" + adi + "]";
    }

}
