package BankAccount;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// OptionMenu-Klasse erbt von der Account-Klasse und repräsentiert das Hauptmenü des Geldautomaten
public class OptionMenu extends Account{
    int selection;
    // Scanner für Benutzereingaben im Hauptmenü
    Scanner menuInput=new Scanner(System.in);
    // Format für die Anzeige von Geldbeträgen
    DecimalFormat monyformat=new DecimalFormat("'$'###,##0.00");
    // Datenstruktur zur Speicherung von Kundennummer und PIN
    HashMap<Integer,Integer> data=new HashMap<>();

    // Methode für die Anmeldung des Benutzers
    public void getLogin() throws IOException{
        int x=1;
        do {
            try {
                // Vordefinierte Kundennummer und PIN für Testzwecke
                data.put(123456,4727);

                // Begrüßung und Eingabe von Kundennummer und PIN
                System.out.println("Welcome to ATM Project: ");
                System.out.println("Enter your Costumer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Your PIN Number: ");
                setPinNumber(menuInput.nextInt());
            }
            catch (Exception e){
                // Fehlerbehandlung für ungültige Zeichen
                System.out.println("\n"+"Invalid character(s). Only Numbers."+ "\n");
                x=2;
            }
            // Überprüfung von Kundennummer und PIN
            for (Map.Entry<Integer, Integer> entry: data.entrySet()){
                if (entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber()){
                    getAcountType();
                }else
                System.out.println("\n"+"Wrong Costumer Number or PIN Number "+"\n");
            }


        }while (x==1);
    }
    // Methode für die Auswahl des Kontotyps im Hauptmenü
    public void  getAcountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("choice: ");

        int selection = menuInput.nextInt();
        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, bye");
                break;
            default:
                System.out.println("\n"+"Invalid Choice."+ "\n");
                getAcountType();
        }
    }

    // Methode für Aktionen im Girokonto
    private void getChecking() {
        System.out.println("Checking Account ");
        System.out.println("Type 1- view Balance ");
        System.out.println("Type 2- withdraw Funds");
        System.out.println("Type 3- desposit Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");
        selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+ monyformat.format(getCheckingDispositInput()));
                getAcountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAcountType();
                break;
            case 3:
                getCheckingDispositInput();
                getAcountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye");
                break;
            default:
                System.out.println("\n"+"Invalid Choice."+ "\n");
                getAcountType();
        }
    }

    public void getSaving(){
        System.out.println("Saving Account ");
        System.out.println("Type 1- view Balance ");
        System.out.println("Type 2- withdraw Funds");
        System.out.println("Type 3- desposit Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");

        selection=menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: "+ monyformat.format(getSavingWithdrawInput()));
                getAcountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAcountType();
                break;
            case 3:
                getSavingDispositInput();
                getAcountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye");
            default:
                System.out.println("\n"+"Invalid Choice."+ "\n");
                getAcountType();
        }
    }
}
