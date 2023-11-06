package _StructuralPatterns.Composite;

import java.math.BigDecimal;

public class Product implements Chargeable {

    private String _name;
    private BigDecimal _cost;

    public Product(String _name, BigDecimal _cost) {
        this._name = _name;
        this._cost = _cost;
    }

    @Override
    public BigDecimal getCost() {
        return this._cost;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public BigDecimal get_cost() {
        return _cost;
    }

    public void set_cost(BigDecimal _cost) {
        this._cost = _cost;
    }

}
