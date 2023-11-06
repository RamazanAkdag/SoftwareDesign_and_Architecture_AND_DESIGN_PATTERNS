package DesignPatterns._CreationalPatterns.AbstractFactory;

public class S8Factory implements TelefonFactory {

    @Override
    public Telefon getTelefon(String Model, String Batarya, int En, int Boy) {
        return new S8(Model, Batarya, En, Boy);
    }

}
