package _StructuralPatterns.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Stores implements Chargeable {
    private String _name;
    private List<Product> productList;
    private List<Pack> packList;

    public Stores(String _name) {
        this._name = _name;
        this.productList = new ArrayList<>();
        this.packList = new ArrayList<>();
    }

    @Override
    public BigDecimal getCost() {
        BigDecimal totalProductCost = CalculateCost.calculateProducts(productList);
        BigDecimal totalPackCost = CalculateCost.calculatePacks(packList);

        BigDecimal finalCost = totalPackCost.add(totalProductCost);
        return finalCost;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Pack> getPackList() {
        return packList;
    }

    public void setPackList(List<Pack> packList) {
        this.packList = packList;
    }

}
