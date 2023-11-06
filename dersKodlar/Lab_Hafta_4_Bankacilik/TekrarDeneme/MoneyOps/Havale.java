package Lab_Hafta_4_Bankacilik.TekrarDeneme.MoneyOps;

import Lab_Hafta_4_Bankacilik.TekrarDeneme.ExchangeRates;
import Lab_Hafta_4_Bankacilik.TekrarDeneme.Entity.SpecialUser;

public class Havale {
    public static void havaleTransfer(Transfer transfer) {
        if (transfer.getCurrency().equals("dollar")) {
            dollarHavale(transfer);
        } else {
            tlHavale(transfer);
        }
    }

    private static void tlHavale(Transfer transfer) {
        double senderTl = transfer.getSenderUser().getTlBalance();
        if (senderTl - transfer.getAmount() >= 0) {
            transfer.getSenderUser().setTlBalance(senderTl - transfer.getAmount());
            transfer.getSenderUser().setTotalBalance(transfer.getSenderUser().getTotalBalance() + transfer.getAmount());

            transfer.getReceiverUser().setTlBalance(transfer.getReceiverUser().getTlBalance() + transfer.getAmount());
            transfer.getReceiverUser()
                    .setTotalBalance(transfer.getReceiverUser().getTotalBalance() + transfer.getAmount());

            System.out.println("islem basarili");

        } else {
            System.out.println("islem gerceklesemez. Fakirsin");
        }
    }

    private static void dollarHavale(Transfer transfer) {
        SpecialUser sender = (SpecialUser) transfer.getSenderUser();
        SpecialUser receiver = (SpecialUser) transfer.getReceiverUser();

        if (sender.getDollarBalance() - transfer.getAmount() >= 0) {
            sender.setDollarBalance(sender.getDollarBalance() - transfer.getAmount());
            sender.setTotalBalance(sender.getTotalBalance() - transfer.getAmount() * ExchangeRates.DOLLAR);

            receiver.setDollarBalance(receiver.getDollarBalance() + transfer.getAmount());
            receiver.setTotalBalance(receiver.getTotalBalance() + transfer.getAmount() * ExchangeRates.DOLLAR);

            System.out.println("islem basarili....");
        } else {
            System.out.println("paran yok ki. ne diye havale yapıyon");
        }

    }
}
