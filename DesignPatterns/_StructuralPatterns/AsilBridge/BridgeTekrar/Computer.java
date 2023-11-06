package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class Computer extends MusicComputer {

    public Computer(VoiceDevice voiceDevice, MusicPlayer musicPlayer) {
        this.setMusicPlayer(musicPlayer);
        this.setVoiceDevice(voiceDevice);

    }

}
