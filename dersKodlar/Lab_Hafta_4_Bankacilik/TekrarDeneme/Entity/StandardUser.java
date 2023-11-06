package Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity;

public class StandardUser extends User {

    public StandardUser(String name, String tckn, double tlBalance) {
        super(name, tckn, tlBalance);
        this.totalBalance = this.tlBalance;

    }

}
