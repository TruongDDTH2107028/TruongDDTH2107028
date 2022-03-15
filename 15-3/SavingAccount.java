package session9;


import java.text.DecimalFormat;
import session9.Bank;

public class SavingAccount  extends Account2 {
    private double dailyInterest;
    private int daysOfYear;

    public SavingAccount(String accountNumber, String accountHolderName, String accountType, double balance, int daysOfYear){
        super(accountNumber, accountHolderName, accountType, balance);
        this.daysOfYear = daysOfYear;
    }

    public  double calculateInterest(){
        dailyInterest = (super.getBalace() * Bank.interesRate / 100) / daysOfYear;


        DecimalFormat twoDForm = new DecimalFormat("#.00");

        return Double.valueOf(twoDForm.format(dailyInterest));


    }
}