package kolos;

public class Account {
    private int accId;
    private int accountBalance = 0;
    private User user;

    public Account(int accId, int accountBalance, User user) {
        this.accId = accId;
        this.accountBalance = accountBalance;
        this.user = user;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
