package DesignPatterns._CreationalPatterns.Prototype;

public class App1 {

    public static void main(String[] args) {
        GenelEntityService genelEntityService = new GenelEntityService();

        long basSaniye = System.currentTimeMillis() / 1000;
        Belge belge1 = genelEntityService.findBelgeById(1L);
        long sonSaniye = System.currentTimeMillis() / 1000;

        System.out.println(belge1);
        System.out.println(sonSaniye - basSaniye);

        basSaniye = System.currentTimeMillis() / 1000;
        Belge belge2 = genelEntityService.findBelgeById(1L);
        sonSaniye = System.currentTimeMillis() / 1000;

        System.out.println(belge2);
        System.out.println(sonSaniye - basSaniye);

        Belge belgeClone = null;
        basSaniye = System.currentTimeMillis() / 1000;
        try {
            belgeClone = belge1.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
        sonSaniye = System.currentTimeMillis() / 1000;

        System.out.println(belgeClone);
        System.out.println(sonSaniye - basSaniye);

    }

}
