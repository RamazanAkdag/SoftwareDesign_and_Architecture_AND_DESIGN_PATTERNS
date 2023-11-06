package DesignPatterns._CreationalPatterns.AbstractFactory;

public class TelefonBayii {
    public static void main(String[] args) {

        TelefonFactory s8Factory = new S8Factory();

        TelefonFactory note8Factory = new Note8Factory();

        Telefon s8 = s8Factory.getTelefon("s8", "2600maah", 4, 7);

        Telefon note8 = note8Factory.getTelefon("note8", "3000mah", 8, 10);

        System.out.println(s8);
        System.out.println(note8);
    }
}
