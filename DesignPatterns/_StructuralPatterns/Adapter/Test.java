package DesignPatterns._StructuralPatterns.Adapter;

public class Test {
    public static void main(String[] args) {

        Priz priz = new Priz();
        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);

        Telefon telefon = new SamsungTelefon();
        // priz.elektrikVer(telefon);//Bu hatalıdır çünkü elektrik ver sadece elektrikli
        // ev aletlerine elektrik verir
        TelefonEEAAdaptor telefonEEAAdaptor = new TelefonEEAAdaptor(telefon);
        priz.elektrikVer(telefonEEAAdaptor);
        /*
         * örneğin bir yerden veri geliyor kodumuza ve xml formatında geliyor ve biz bu
         * veriyi gönderirken de json kullanmamız gerek
         * olsun. burada xml verisini jsona çevirmek için bir adapter gereklidir. böyle
         * durumlar içi nkullanılabilir
         * 
         */
    }
}
