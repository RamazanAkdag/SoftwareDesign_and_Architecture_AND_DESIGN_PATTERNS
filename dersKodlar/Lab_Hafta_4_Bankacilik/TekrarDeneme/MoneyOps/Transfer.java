package Lab_Hafta_4_Bankacilik.TekrarDeneme.MoneyOps;

import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.User;

public class Transfer {

    private User senderUser;
    private User receiverUser;
    private double amount;
    private String currency;

    public Transfer(User senderUser, User receiverUser, double amount) {
        this.senderUser = senderUser;
        this.receiverUser = receiverUser;
        this.amount = amount;
        this.currency = "tl";
    }

    public Transfer(User senderUser, User receiverUser, double amount, String currency) {
        this.senderUser = senderUser;
        this.receiverUser = receiverUser;
        this.amount = amount;
        this.currency = currency;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    public User getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(User receiverUser) {
        this.receiverUser = receiverUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
