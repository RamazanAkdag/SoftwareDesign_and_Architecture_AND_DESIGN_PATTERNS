package Lab_Hafta_4_Bankacilik.TekrarDeneme.MoneyOps;

import Lab_Hafta_4_Bankacilik.TekrarDeneme.ExchangeRates;
import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.SpecialUser;
import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.StandardUser;
import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.User;

public class Eft {

    public static void eftTransfer(Transfer transfer) {

        if (transfer.getSenderUser() instanceof StandardUser) {// standard user eft

            StandardUser sender = (StandardUser) transfer.getSenderUser();
            eftStandardUser(sender, transfer.getReceiverUser(), transfer.getAmount());
        } else {
            // special user eft

            SpecialUser sender = (SpecialUser) transfer.getSenderUser();

            if (transfer.getCurrency().equals("dollar")) {
                // dollar transfer
                SpecialUser receiver = (SpecialUser) transfer.getReceiverUser();
                eftDollarForSpecials(sender, receiver, transfer.getAmount());
            }
            if (transfer.getCurrency().equals("tl")) {
                // tl transfer
                eftTlForSpecials(sender, transfer.getReceiverUser(), transfer.getAmount());
            }

        }
    }

    private static void eftStandardUser(StandardUser sender, User receiver, double amount) {
        double eftCost = amount * 5 / 100;
        if (eftCost < 20) {
            eftCost = 20;
        }
        if (sender.getTlBalance() - amount - eftCost >= 0) {

            double newSenderBalance = sender.getTlBalance() - amount - eftCost;
            sender.setTlBalance(newSenderBalance);
            sender.setTotalBalance(newSenderBalance);

            receiver.setTlBalance(receiver.getTlBalance() + amount);
            receiver.setTotalBalance(receiver.getTotalBalance() + amount);

            System.out.println("islem basarili...");

        } else {
            System.out.println("islem gerçeklesemez. Fakirsin");
        }
    }

    private static void eftDollarForSpecials(SpecialUser sender, SpecialUser receiver, double amount) {
        double eftCost = 20;
        if (sender.getDollarBalance() - amount >= 0) {
            double newSenderDollarBalance = sender.getDollarBalance() - amount;
            double newSenderTlBalance = sender.getTlBalance() - eftCost;
            double newSenderTotalBalance = newSenderDollarBalance * ExchangeRates.DOLLAR + newSenderTlBalance;

            sender.setDollarBalance(newSenderDollarBalance);
            sender.setTlBalance(newSenderTlBalance);
            sender.setTotalBalance(newSenderTotalBalance);

            receiver.setDollarBalance(receiver.getDollarBalance() + amount);
            receiver.setTotalBalance(sender.getTotalBalance() + amount * ExchangeRates.DOLLAR);

            System.out.println("işlem başarılı...");
        } else {
            System.out.println("islem gerçekleşemez fakirsin");
        }
    }

    private static void eftTlForSpecials(SpecialUser sender, User receiver, double amount) {
        double eftCost = 20;

        if (sender.getTlBalance() - amount - eftCost >= 0) {

            double newSenderTlBalance = sender.getTlBalance() - amount - eftCost;
            double newSenderTotalBalance = newSenderTlBalance + sender.getDollarBalance() * ExchangeRates.DOLLAR;

            sender.setTlBalance(newSenderTlBalance);
            sender.setTotalBalance(newSenderTotalBalance);

            receiver.setTlBalance(receiver.getTlBalance() + amount);
            receiver.setTotalBalance(receiver.getTotalBalance() + amount);

            System.out.println("işlem başarılı...");
        } else {
            System.out.println(" islem gerceklesemez...");
        }

    }

}
