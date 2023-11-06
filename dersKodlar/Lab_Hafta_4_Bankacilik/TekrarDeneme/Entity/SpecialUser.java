package Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity;

import Lab_Hafta_4_Bankacilik.TekrarDeneme.ExchangeRates;

public class SpecialUser extends User {
    private double dollarBalance;

    public SpecialUser(String name, String tckn, double tlBalance, double dollarBalance) {
        super(name, tckn, tlBalance);
        this.dollarBalance = dollarBalance;
        this.totalBalance = this.dollarBalance * ExchangeRates.DOLLAR + this.tlBalance;
    }

    public double getDollarBalance() {
        return dollarBalance;
    }

    public void setDollarBalance(double dollarBalance) {
        this.dollarBalance = dollarBalance;
    }

}
