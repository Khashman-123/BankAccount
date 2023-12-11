package Berechnungen;

import java.util.Scanner;

public class ZinseszinsMitMonatlichenEinzahlungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie das ursprüngliche Kapital ein: ");
        double kapital = scanner.nextDouble();

        System.out.print("Geben Sie den jährlichen Zinssatz (in Prozent) ein: ");
        double jahrlicherZinssatz = scanner.nextDouble();

        // Zinssatz pro Monat berechnen
        double monatlicherZinssatz = jahrlicherZinssatz / 12 / 100;

        System.out.print("Geben Sie die Anzahl der Jahre ein: ");
        int jahre = scanner.nextInt();

        System.out.print("Geben Sie den Betrag der monatlichen Einzahlungen ein: ");
        double monatlicheEinzahlung = scanner.nextDouble();

        // Anzahl der Zinszahlungen pro Jahr (hier nehmen wir an, dass es einmal pro Monat ist)
        int zinszahlungenProJahr = 12;

        // Zusammengesetzte Zinsen mit monatlichen Einzahlungen berechnen
        double endbetrag = kapital * Math.pow((1 + monatlicherZinssatz), zinszahlungenProJahr * jahre)
                + monatlicheEinzahlung * ((Math.pow((1 + monatlicherZinssatz), zinszahlungenProJahr * jahre) - 1) / monatlicherZinssatz);

        System.out.println("Der Endbetrag nach " + jahre + " Jahren mit monatlichen Einzahlungen beträgt: " + endbetrag);

        scanner.close();
    }
}
