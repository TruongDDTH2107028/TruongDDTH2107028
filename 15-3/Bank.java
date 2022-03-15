package session9;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    String bankID;
    String bankName;
    String branch;

    private  ArrayList bankDetails = new ArrayList();

    public  static final float interesRate = 3.5F;

    public Bank() {

        bankID = "Not Specified";
        bankName = "Not Specified";
        branch = " Not Specified";

    }


    public Bank(String bankID, String bankName, String branch) {

        this.bankID = bankID;
        this.bankName = bankName;
        this.branch = branch;
    }

    public void addBankDetails(String[] details) {
        System.out.println("Adding Bank Details. Please wait...");

        for ( int i = 0; i < details.length; i++){
            bankDetails.add(details[i]);
        }
    }

    public void  displayBankDetails(){
        System.out.println("Bank Details of Customer");
        System.out.println("Bank Id. Bank Name \t Branch Interest");
        System.out.println("--------------");

        Iterator iBank = bankDetails.iterator();
        while (iBank.hasNext()) {
            System.out.print(iBank.next() + "  ");
        }
        System.out.print(interesRate);
        System.out.println("");
    }



}