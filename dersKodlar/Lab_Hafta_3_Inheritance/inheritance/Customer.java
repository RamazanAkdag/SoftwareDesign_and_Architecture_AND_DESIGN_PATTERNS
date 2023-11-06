package Lab_Hafta_3_Inheritance.inheritance;

import java.util.List;

public class Customer extends User {
    private String _tc;

    public String get_tc() {
        return _tc;
    }

    public void set_tc(String _tc) {
        this._tc = _tc;
    }

    public List showProducts() {
        return null;
    }

}
