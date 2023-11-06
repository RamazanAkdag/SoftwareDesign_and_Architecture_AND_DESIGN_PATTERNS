package Lab_Hafta_3_Inheritance.inheritance;

import java.util.List;

public class Supplier extends User {
    private String _vkn;

    public String getVkn() {
        return _vkn;
    }

    public void setVkn(String vkn) {
        this._vkn = vkn;
    }

    public List listProducts() {
        return null;
    }

}
