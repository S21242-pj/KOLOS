package kolos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Bank {
    private String bankName;
  //private long bankId;
    private String bankId;
    private List<Account> accList = new ArrayList<>();

    public Bank(){
    }

    public void addAccounts(Account listAccounts){
        accList.add(listAccounts);
    }

    public void takeAccount(Account listAccounts){
        IntStream.range(0, accList.size()).forEach(i -> accList.get(i));
    }

    public Bank(String bankName, String bankId) {
        this.bankName = bankName;
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
