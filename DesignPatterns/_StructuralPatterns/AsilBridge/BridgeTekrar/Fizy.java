package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class Fizy implements MusicPlayer {

    @Override
    public void play(Music Music) {
        System.out.println("Fizy playing... -> " + Music.getName());
    }

}
