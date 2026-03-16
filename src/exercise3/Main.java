package exercise3;

import exercise3.entities.ContoCorrente;
import exercise3.entities.ContoOnLine;
import exercise3.exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

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
                logger.error("ERRORE: " + e.getMessage());
            } catch (NumberFormatException e) {
                logger.error("ERRORE: inserire un numero (maggiore di 0) " + e.getMessage());
            }
        }

        logger.info("TOTALE SALDO: {}", contoOnLine.restituisciSaldo());
    }
}
