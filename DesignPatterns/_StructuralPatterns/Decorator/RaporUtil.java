package _StructuralPatterns.Decorator;

import java.util.ArrayList;
import java.util.List;

public class RaporUtil {
    public static String getCizgiliMetin(String metin) {
        String[] satirList = metin.split("\n");

        String cizgiliMetin = "";

        for (String satir : satirList) {
            String cizgiliSatir = herSatiraBirCizgiEkle(satir);
            cizgiliMetin += cizgiliSatir;

        }

        return cizgiliMetin;

    }

    private static String herSatiraBirCizgiEkle(String satir) {
        String yeniSatir;

        if (satir.trim().length() == 0) {
            yeniSatir = "\n";
        } else {
            yeniSatir = "\n-" + satir;
        }

        return yeniSatir;
    }

    public static String metniSigdir(String metin, int genislik) {
        String kucukSatirliMetin = "";
        String[] satirList = metin.split("\n");

        for (String satir : satirList) {
            if (satir.length() <= 30) {
                kucukSatirliMetin += satir;
            } else {
                List<String> parcalanmisList = parcala(satir, genislik);

                for (String yeniSatir : parcalanmisList) {
                    kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, yeniSatir);
                }
            }
        }

        return kucukSatirliMetin;
    }

    private static List<String> parcala(String satir, int genislik) {

        List<String> parcaliSatirList = new ArrayList<>();

        for (int i = 0; i <= satir.length() / genislik; i++) {
            int ilkHane = genislik * i;
            int sonHane = ilkHane + genislik;

            if (sonHane > satir.length()) {
                sonHane = satir.length();
            }

            String parcaliSatir = satir.substring(ilkHane, sonHane);

            if (parcaliSatir.trim().length() > 0) {
                parcaliSatirList.add(parcaliSatir);
            }
        }

        return parcaliSatirList;
    }

    private static String ekleVeYeniSatiraGec(String anaMetin, String eklenenMetin) {
        return anaMetin + eklenenMetin + "\n";
    }
}
