package Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity;

public abstract class User {

    protected String name;
    protected String tckn;
    protected double tlBalance;
    protected double totalBalance;

    public User(String name, String tckn, double tlBalance) {
        this.name = name;
        this.tckn = tckn;
        this.tlBalance = tlBalance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public double getTlBalance() {
        return tlBalance;
    }

    public void setTlBalance(double tlBalance) {
        this.tlBalance = tlBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

}
