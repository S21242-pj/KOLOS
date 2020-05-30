package kolos;

public class Main {

    public static void main(String[] args) {
        User user = new User("Szymon", "Grzeczkowicz", 1111);
        Account account = new Account(7007, user);
        Bank bank = new Bank("PJ-ank sp z.o.o", "9696");

        System.out.println("\n IMIE: " + user.getUserFirstName() + "   \n NAZWISKO: " + user.getUserLastName() + "   \n NUMER KLIENTA: " + user.getUserId());
        System.out.println("\n ID KONTA: " + account.getAccId() + "   \n IMIE: " + account.getUser().getUserFirstName() + "   \n NAZWISKO: " + account.getUser().getUserLastName());
        System.out.println("\n ");

        /**
         * inny User
         */

     //   User user1 = new User("GdzieJest", " MojaLinaiGałąź", 1112);
     //   Account account2 = new Account(7008, user1);



        System.out.println("\n" + bank.getBankName() + "\n" + bank.getBankId());
    }
}


//