package kolos;

import java.math.BigDecimal;

public class Account {
    private int accId;
    //Tutaj próbowałem z BigDecimalem
    private BigDecimal accountBalance = new BigDecimal("0");
    //Tutaj tworze inny balance z doublem.
    private double accountBalance1;
    private User user;

    public Account(int accId, User user) {
        this.accId = accId;
       // this.accountBalance = accountBalance;
        this.user = user;
    }

//    public Account(int accId, double accountBalance1, User user1) {
//      this.accId = accId;
//      this.accountBalance1 = accountBalance1;
//      this.user = user1;
//}

//    public double getAccountBalance1() {
//        return accountBalance1;
//    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void createAndSetBalance(double money){
        accountBalance = accountBalance.add(BigDecimal.valueOf(money));
    }

    public void accountBalance(){
        System.out.println("Balance: " + accountBalance);
    }

}
