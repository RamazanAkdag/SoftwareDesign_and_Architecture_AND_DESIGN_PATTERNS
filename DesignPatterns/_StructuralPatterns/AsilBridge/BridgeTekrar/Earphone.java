package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class Earphone implements VoiceDevice {

    @Override
    public void getVoice(String voice) {
        System.out.println("Earphone getting voice : " + voice);
    }

}