package bank.t2108a;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
    private Long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String description, String beneficiaryAccount, long money){

        this.id = IdGenerate.getNewId();
        this.dayTrading = LocalDate.now();
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }
    public String getBeneficiaryAccount(){ return beneficiaryAccount;}
    public Long getId() { return id;}
    public LocalDate getDayTrading(){ return dayTrading;}
    public String getDescription(){ return description;}

    public void setDescription(String description) { this.description = description;}
    public long getMoney(){ return money;}

    public void setMoney(long money) { this .money = money; }

    public String toString(){
        DateTimeFormatter myFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " - " + dayTrading.format(myFormater) + " - " + description + " - " + Controller.formatMoney(money) + " - " + beneficiaryAccount + "\n";

    }

}
