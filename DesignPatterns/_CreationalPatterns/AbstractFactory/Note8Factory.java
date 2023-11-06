package DesignPatterns._CreationalPatterns.AbstractFactory;

public class Note8Factory implements TelefonFactory {

    @Override
    public Telefon getTelefon(String Model, String Batarya, int En, int Boy) {
        return new Note8(Model, Batarya, En, Boy);
    }

}
