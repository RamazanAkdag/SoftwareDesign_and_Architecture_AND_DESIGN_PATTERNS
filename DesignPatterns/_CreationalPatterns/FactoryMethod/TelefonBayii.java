package DesignPatterns._CreationalPatterns.FactoryMethod;

public class TelefonBayii {

    public static void main(String[] args) {
        Telefon s8 = TelefonFabrikasi.getTelefon("S8", "2600mah", 4, 7);

        Telefon note8 = TelefonFabrikasi.getTelefon("Note8", "3000mah", 7, 10);

        System.out.println("s8 özellikleri :" + s8);
        System.out.println("__________________");
        System.out.println("note8 özellikleri : " + note8);
    }

}
