package _StructuralPatterns.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pack implements Chargeable {

    private String _name;
    private List<Product> _productList;

    public Pack(String _name) {
        this._name = _name;
        this._productList = new ArrayList<>();
    }

    @Override
    public BigDecimal getCost() {
        return CalculateCost.calculateProducts(_productList);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<Product> get_productList() {
        return _productList;
    }

    public void set_productList(List<Product> _productList) {
        this._productList = _productList;
    }

}
