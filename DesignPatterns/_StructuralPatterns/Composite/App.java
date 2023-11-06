package _StructuralPatterns.Composite;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Product tomato = new Product("tomato", BigDecimal.TEN);
        Product potato = new Product("potato", BigDecimal.ONE);
        Product onion = new Product("onion", BigDecimal.ONE);

        Pack vegetablesPack = new Pack("vegetables");
        vegetablesPack.get_productList().add(tomato);
        vegetablesPack.get_productList().add(potato);
        vegetablesPack.get_productList().add(onion);

        Product voiceDevice = new Product("voice device", BigDecimal.valueOf(6000));
        Product earphone = new Product("earphone", BigDecimal.valueOf(3000));

        Pack technoPack = new Pack("technology pack");
        technoPack.get_productList().add(earphone);
        technoPack.get_productList().add(voiceDevice);

        Product ball = new Product("Football ball", BigDecimal.valueOf(200));

        Stores store = new Stores("Ramadan Store");
        Product yag = new Product("yağ", BigDecimal.valueOf(100));

        store.getProductList().add(yag);
        store.getPackList().add(vegetablesPack);

        ProductCart cart = new ProductCart("My Cart");
        cart.getChargeables().add(technoPack);
        cart.getChargeables().add(vegetablesPack);
        cart.getChargeables().add(ball);
        cart.getChargeables().add(store);

        System.out.println("Toplam urun fiyati : " + cart.getTotalCost());

    }

}
