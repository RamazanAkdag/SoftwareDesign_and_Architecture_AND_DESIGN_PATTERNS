package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class Spotify implements MusicPlayer {

    @Override
    public void play(Music Music) {
        System.out.println("Spotify playing... -> " + Music.getName());
    }

}
