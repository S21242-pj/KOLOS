package kolos;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private int bankId;
    private List<Account> accList = new ArrayList<>();

    public Bank(){
    }

    public List<Account> findAll(){
        return this.accList;
    }

    //

    public Bank(String bankName, int bankId) {
        this.bankName = bankName;
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
}
