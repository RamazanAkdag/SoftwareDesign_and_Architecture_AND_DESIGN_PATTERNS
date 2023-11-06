package DesignPatterns._CreationalPatterns.Builder;

public class EmlakciPatternli {

    public static void main(String[] args) {
        EvBuilder builder = EvBuilder.startBuild()
                .setIl("İstanbul")
                .setIlçe("Başakşehir")
                .setMahalle("Başakşehir")
                .setBinaYili(2010)
                .setOdaSayisi(3)
                .setBanyoSayisi(2)
                .setTuvaletSayisi(1)
                .setBalkonSayisi(2)
                .setDublex(false)
                .setEsyali(true)
                .setHasOtopark(true)
                .setHasCocukParki(false)
                .setHasKlima(true)
                .setHasHavuz(false);

        Ev ev = builder.Build();
        System.out.println(ev);
    }
    /*
     * Bir ev örneği üzerinden gidersek. Ev abstract classından bahçeli ,
     * otoparklı,klimalı,dublex gibi bir sürü alt sınıf oluşturabiliriz.
     * ya da bir class oluşturup evin sahip olduğu özellikleri true olmayanları da
     * null olarak bırakabiliriz. Fakat ilk seçeneği uygulayınca kendimizi
     * bir sürü alt sınıf içinde kaybolmuş bir halde bulabiliriz. veya ikinciyi
     * uygularken de constructorlar(bir sürü null) pek hoş bir görüntü
     * vermeyebilir. bu sebeple araya bir builder classı koyduk. Ev oluturulacağı
     * zaman bu ev doğrudan ev nesnesine değil buildera gelecek
     * burada yapılan her setleme işleminde builder nesnesi kendini tekrardan
     * döndürerek sadece istediğimiz değerleri setlememize olanak sağlar.
     * ve girilen değerlerle(hepsinin girilmesi şart değil) build() metodu
     * çağırıldığı zaman ev girilen özelliklerle oluşur ve kullanıma hazır hale
     * gelir. Bu sayede kod satırlarına null yazmaktan veya bir sürü alt sınıf
     * oluşturmaktan kurtuluruz
     */

}
