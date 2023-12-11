package BankAccount;
import java.text.DecimalFormat;
import java.util.Scanner;


// Die Account-Klasse repräsentiert ein Bankkonto

public class Account {
    // Scanner zum Einlesen von Benutzereingaben
    Scanner input=new Scanner(System.in);
    // Format für die Anzeige von Geldbeträgen
    DecimalFormat monyformat=new DecimalFormat("'$'###,##0.00");
    // Kundennummer, PIN und Kontostände für Giro- und Sparkonto
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingbalance=0;

    // Getter- und Setter-Methoden für Kundennummer und PIN
    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    // Methoden zur Berechnung von Abhebungen und Einzahlungen für Giro- und Sparkonto
    public  double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }

    public  double calcSavingWithdraw(double amount){
        savingbalance=(savingbalance-amount);
        return savingbalance;
    }

    public  double calcCheckingDiposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }

    public  double calcSavingDiposit(double amount){
        savingbalance=(savingbalance+amount);
        return savingbalance;
    }
    // Methode zur Benutzereingabe für Girokonto-Abhebungen
     public void getCheckingWithdrawInput(){
         // Anzeige des Girokontostands
        System.out.println("Checking Account Balance: "+monyformat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking Account");
        double amount =input.nextDouble();

         // Überprüfung, ob Abhebung möglich ist
        if ((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New cheking Balance: "+monyformat.format(checkingBalance));
        }else
            System.out.println("Balance can not be negative "+"\n");
    }


    public double getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+monyformat.format(savingbalance));
        System.out.println("Amount you want to withdraw from checking Account");
        double amount =input.nextDouble();

        if ((savingbalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Balance: "+monyformat.format(savingbalance));
        }else
            System.out.println("Balance can not be negative "+"\n");
        return amount;
    }


    public double getCheckingDispositInput() {
        System.out.println("Checking Account Balance: " + monyformat.format(checkingBalance));
        System.out.println("Amount you want to deposit into checking Account");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDiposit(amount);
            System.out.println("New Checking Balance: " + monyformat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative " + "\n");
        }
        return amount;
    }



    public void getSavingDispositInput(){
        System.out.println("Saving Account Balance: "+monyformat.format(savingbalance));
        System.out.println("Amount you want to withdraw from checking Account");
        double amount =input.nextDouble();

        if ((savingbalance+amount)>=0){
            calcSavingDiposit(amount);
            System.out.println("New Saving Balance: "+monyformat.format(savingbalance));
        }else
            System.out.println("Balance can not be negative "+"\n");
    }
}
