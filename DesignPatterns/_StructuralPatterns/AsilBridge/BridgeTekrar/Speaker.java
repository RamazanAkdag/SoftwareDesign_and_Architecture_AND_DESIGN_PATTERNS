package _StructuralPatterns.AsilBridge.BridgeTekrar;

public class Speaker implements VoiceDevice {

    @Override
    public void getVoice(String voice) {
        System.out.println("Speaker getting voice : " + voice);
    }

}
