package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class App {
    public static void main(String[] args) {
        MusicComputer musicComputer;
        Music music;

        musicComputer = new Computer(new Earphone(), new Fizy());
        music = new Music("Ahmet Kaya - Doruklara sevdalandım", "Kan gölünde durulandım, hayatı duymak için...");
        musicComputer.musicPlayCpt(music);

    }

}
