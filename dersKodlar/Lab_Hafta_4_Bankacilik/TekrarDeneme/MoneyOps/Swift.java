package Lab_Hafta_4_Bankacilik.TekrarDeneme.MoneyOps;

import Lab_Hafta_4_Bankacilik.TekrarDeneme.ExchangeRates;
import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.SpecialUser;

public class Swift {
    private static double swiftCost = 500;

    public static void swiftTransfer(Transfer transfer) {
        SpecialUser sender = (SpecialUser) transfer.getSenderUser();
        SpecialUser receiver = (SpecialUser) transfer.getReceiverUser();

        if (transfer.getCurrency().equals("dollar")) {
            swiftDollar(sender, receiver, transfer.getAmount());
        }
        if (transfer.getCurrency().equals("tl")) {
            swiftTl(sender, receiver, transfer.getAmount());
        }

    }

    private static void swiftDollar(SpecialUser sender, SpecialUser receiver, double amount) {
        if (sender.getTlBalance() - swiftCost >= 0 && sender.getDollarBalance() - amount >= 0) {
            double newSenderDollar = sender.getDollarBalance() - amount;
            double newSenderTl = sender.getTlBalance() - swiftCost;
            sender.setDollarBalance(newSenderDollar);
            sender.setTlBalance(newSenderTl);
            sender.setTotalBalance(newSenderDollar * ExchangeRates.DOLLAR + newSenderTl);

            receiver.setDollarBalance(receiver.getDollarBalance() + amount);
            receiver.setTotalBalance(receiver.getTotalBalance() + amount * ExchangeRates.DOLLAR);

            System.out.println("islem basarili ... ");

        } else {
            System.out.println("yeterli para yok. işlem yapılamaz");

        }
    }

    private static void swiftTl(SpecialUser sender, SpecialUser receiver, double amount) {
        if (sender.getTlBalance() - swiftCost - amount >= 0) {
            double newSenderTl = sender.getTlBalance() - swiftCost - amount;
            double newSenderTotal = sender.getTotalBalance() - swiftCost - amount;
            sender.setTlBalance(newSenderTl);
            sender.setTotalBalance(newSenderTotal);

            receiver.setTlBalance(receiver.getTlBalance() + amount);
            receiver.setTotalBalance(receiver.getTotalBalance() + amount);

            System.out.println("islem basarili");

        } else {
            System.out.println("yeterli miktarda para yok. işlem yapılamaz");
        }

    }

}
