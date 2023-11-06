package _StructuralPatterns.AsilBridge.BridgeTekrar;

public abstract class MusicComputer {

    protected MusicPlayer musicPlayer;
    protected VoiceDevice voiceDevice;

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public VoiceDevice getVoiceDevice() {
        return voiceDevice;
    }

    public void setVoiceDevice(VoiceDevice voiceDevice) {
        this.voiceDevice = voiceDevice;
    }

    public void musicPlayCpt(Music music) {
        musicPlayer.play(music);
        voiceDevice.getVoice(music.getVoice());
    }

}
