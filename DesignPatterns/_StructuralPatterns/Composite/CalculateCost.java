package _StructuralPatterns.Composite;

import java.math.BigDecimal;
import java.util.List;

public class CalculateCost {

    public static BigDecimal calculateProducts(List<Product> products) {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (Product product : products) {
            totalCost = totalCost.add(product.getCost());
        }

        return totalCost;
    }

    public static BigDecimal calculatePacks(List<Pack> packs) {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (Pack pack : packs) {
            totalCost = totalCost.add(pack.getCost());
        }

        return totalCost;
    }

}
