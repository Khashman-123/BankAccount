package Berechnungen;
import java.util.*;

public class RenteBerechnung {

    public  double renteberechnung(double anfangKapital,int dauer,double zinsensatz,double jahresEinzahlung){
        int n=1;
        System.out.println("Geben Sie Ihr Anfangkapital ein: ");
        Scanner scanner=new Scanner(System.in);
        anfangKapital=scanner.nextDouble();

        System.out.println("Geben Sie die Zinssatz im Prozent: ");
        zinsensatz=scanner.nextDouble() / 100;

        System.out.println("Geben Sie die Anzahl der Jahre ein: ");
        dauer=scanner.nextInt();

        double zinsbetrag= anfangKapital*dauer*zinsensatz;


        System.out.print("Geben Sie den Betrag der jährlichen Einzahlungen ein: ");
         jahresEinzahlung = scanner.nextDouble();
         double endbetrag = anfangKapital * Math.pow((1 + zinsensatz / n), n * dauer)
                 + jahresEinzahlung
                  * ((Math.pow((1 + zinsensatz / n), n * dauer) - 1) / (zinsensatz / n));
        System.out.println("Endbetrag ist: "+ endbetrag);
        System.out.println("Die Zinsen betragen " + zinsbetrag);
        scanner.close();


        return endbetrag;
    }

    public static void main(String[] args) {

        RenteBerechnung r=new RenteBerechnung();
        r.renteberechnung(0,00,0,0);
    }

  }

