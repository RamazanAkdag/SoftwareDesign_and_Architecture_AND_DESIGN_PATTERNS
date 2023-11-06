package _StructuralPatterns.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductCart {
    private String _name;
    private List<Chargeable> chargeables;

    public ProductCart(String _name) {
        this._name = _name;
        this.chargeables = new ArrayList<>();
    }

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (Chargeable chargeable : chargeables) {
            totalCost = totalCost.add(chargeable.getCost());

        }

        return totalCost;

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<Chargeable> getChargeables() {
        return chargeables;
    }

    public void setChargeables(List<Chargeable> chargeables) {
        this.chargeables = chargeables;
    }
}
