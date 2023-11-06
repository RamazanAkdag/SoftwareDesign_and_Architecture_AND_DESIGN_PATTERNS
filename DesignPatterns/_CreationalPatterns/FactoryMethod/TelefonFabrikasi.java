package DesignPatterns._CreationalPatterns.FactoryMethod;

public class TelefonFabrikasi {
    public static Telefon getTelefon(String Model, String Batarya, int En, int Boy) {
        Telefon telefon;

        /*
         * Bu tasarım kalıında merkezi bir noktadan üyeleris kontrol etmek
         * esastır fakat bu tasarım kalıbının da bir dezavantajı
         * bizim yaptığımız kontrollerin örneğin 100lerce farklı model telefon
         * olduğunda
         * if ve elselerin kodun okunabilirliğini sıfıra kadar düşürebilmesine neden
         * olabilmesi,
         * yani aşağıdaki gibi if ve elselerin yoğun bir şekilde kullanılabilmesine yol
         * açabilmesidir.
         * 
         * Bundan dolayı da Abstract Factory Kalıbı doğmuştur
         * 
         */

        if ("S8".equalsIgnoreCase(Model)) {
            telefon = new S8(Model, Batarya, En, Boy);
        } else if ("Note8".equalsIgnoreCase(Model)) {
            telefon = new Note8(Model, Batarya, En, Boy);
        } else {
            throw new RuntimeException("geçerli bir model girmediniz");
        }

        return telefon;
    }

}
