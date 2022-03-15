package session10;

import session9.Bank;

import java.util.Scanner;

public class TestAccount2 {
    public static void main(String[] args) {

        String[] accountDetails = new String[5];

        String[] bankDetails = new String[3];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter  Account Number:");
        accountDetails[0] = input.nextLine();
        System.out.print("Enter Name:");
        accountDetails[1] = input.nextLine();
        System.out.print("Enter Account Type:");
        accountDetails[1] = input.nextLine();
        System.out.print("Enter Balance:");
        accountDetails[1] = input.nextLine();
        System.out.print("Enter Number of Days:");
        accountDetails[1] = input.nextLine();

        System.out.print("Enter Bank ID:");
        bankDetails[0] = input.nextLine();
        System.out.print("Enter Bank Name:");
        bankDetails[1] = input.nextLine();
        System.out.print("Enter Branch:");
        bankDetails[2] = input.nextLine();

        System.out.print("-----------------");

        SavingAccount objAccount2 = new SavingAccount(accountDetails[0], accountDetails[1],accountDetails[2],Double.parseDouble(accountDetails[3]),Integer.parseInt(accountDetails[4]));


        objAccount2.displayDetails();
        System.out.println("-----------------------------------");

        Bank objBank1 = new Bank();

        objBank1.addBankDetails(bankDetails);

        objBank1.displayBankDetails();

        objBank1.displayBankDetails();

        System.out.println("Daily Interest is: $" +
                objAccount2.calculateInterest());




    }
}
