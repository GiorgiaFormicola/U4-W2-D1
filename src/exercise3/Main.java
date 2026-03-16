package exercise3;

import exercise3.entities.ContoCorrente;
import exercise3.entities.ContoOnLine;
import exercise3.exceptions.BancaException;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Giorgia", 150);
        ContoOnLine contoOnLine = new ContoOnLine("Giorgia", 150, 60);

        try {
            conto.preleva(10);
        } catch (BancaException e) {
            System.out.println("TEST 1: " + e.getMessage());
        }

        try {
            conto.preleva(200);
        } catch (BancaException e) {
            System.out.println("TEST 2: " + e.getMessage());
        }


        try {
            contoOnLine.preleva(20);
        } catch (BancaException e) {
            System.out.println("TEST 3: " + e.getMessage());
        }

        try {
            contoOnLine.preleva(70);
        } catch (BancaException e) {
            System.out.println("TEST 4: " + e.getMessage());
        }

        try {
            contoOnLine.preleva(200);
        } catch (BancaException e) {
            System.out.println("TEST 5: " + e.getMessage());
        }
    }
}
