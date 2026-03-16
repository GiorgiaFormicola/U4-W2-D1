package exercise3;

import exercise3.entities.ContoCorrente;
import exercise3.entities.ContoOnLine;
import exercise3.exceptions.BancaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente("Giorgia", 150);
        ContoOnLine contoOnLine = new ContoOnLine("Giorgia", 150, 100);


        while (contoOnLine.restituisciSaldo() > 0) {
            System.out.println("Inserire l'importo da prelevare");
            try {
                double importoDaPrelevare = Double.parseDouble(scanner.nextLine());
                if (importoDaPrelevare <= 0) throw new NumberFormatException("For input number: < 0");
                contoOnLine.preleva(importoDaPrelevare);
            } catch (BancaException e) {
                System.out.println("ERRORE: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("ERRORE: inserire un numero (maggiore di 0) " + e.getMessage());
            }
        }

        System.out.println("TOTALE SALDO: " + contoOnLine.restituisciSaldo());
    }
}
