package Lab_Hafta_3_Inheritance.polymorphism;

public interface Sekil {
    public double alanHesapla();
}

class AlanHesapla {
    public void yazdir(Sekil sekil) {
        System.out.println(sekil.alanHesapla());
    }
}

class Kare implements Sekil {
    private int kenar;

    public Kare(int kenar) {
        this.setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public double alanHesapla() {
        return this.getKenar() * this.getKenar();
    }
}

class Ucgen implements Sekil {
    private int kenar;
    private int yukseklik;

    public Ucgen(int kenar, int yukseklik) {
        this.setKenar(kenar);

        this.setYukseklik(yukseklik);

    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double alanHesapla() {
        return (this.getKenar() * this.getYukseklik()) / 2;
    }

}

class Dikdortgen implements Sekil {
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.setUzunKenar(uzunKenar);
        this.setKisaKenar(kisaKenar);
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double alanHesapla() {
        return (this.getKisaKenar() * this.getUzunKenar());
    }
}
