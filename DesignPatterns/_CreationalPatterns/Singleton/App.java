package DesignPatterns._CreationalPatterns.Singleton;

class Ramo implements Runnable {

    @Override
    public void run() {

        System.out.println("thread started");
        Singleton.getSingleton();
    }

}

public class App {
    public static void main(String[] args) {

        Thread ramo = new Thread(new Ramo());
        Thread ramo2 = new Thread(new Ramo());

        ramo.start();
        ramo2.start();

        /*
         * Denemede de Görüldüğü üzere
         * Dingleton tasarım kalıbının asıl amacı bir classtan sadece 1 tane obje
         * oluşmasını sağlamaktır. Bunun için bir class oluşturduk
         * sonra o classa bir statik nesne koyduk. Bu nesne ilk çağrıldığında çalışır ve
         * getirilir. Sonrasında ise statik olduğu için her seferinde
         * aynı nesne tekrar çağırılıp kullanılır ve bu classtan maximum bir kere obje
         * üretilmesini sağlar. Bu veritabanı bağlantılarında
         * gelen bir sürü isteğe karşılık aynı anda sistem züerinde tek bir tane
         * bağlantı nesnesi oluşturarak gelen isteklerin
         * veritabanında çakışma yapmasını önlemek için kullanılabilir
         * 
         */
    }
}
