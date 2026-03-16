package exercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insert the number of kilometers travelled:");
            try {
                /*int km = Integer.parseInt(scanner.nextLine());*/
                /*int km = scanner.nextInt();*/
                /*double km = scanner.nextDouble();*/
                double km = Double.parseDouble(scanner.nextLine());

                if (km <= 0) {
                    logger.error("The value must be bigger than zero, try again!");
                    continue;
                }

                System.out.println("Insert the liters of fuel consumed:");

                /*int liters = Integer.parseInt(scanner.nextLine());*/
                /*int liters = scanner.nextInt();*/
                /*double liters = scanner.nextDouble();*/
                double liters = Double.parseDouble(scanner.nextLine());

                if (liters < 0) {
                    logger.error("The value must be a positive number, try again!");
                    continue;
                }

                /*int kmPerLiter = km / liters;*/
                double kmPerLiter = km / liters;
                if (Double.isInfinite(kmPerLiter)) throw new ArithmeticException("/ by zero");
                logger.info("The kilometers per liter travelled are {}", kmPerLiter);
                break;
            } catch (NumberFormatException e) {
                logger.error("You must type a number, try again! + ERROR: {})", e.getMessage());
            } catch (ArithmeticException e) {
                logger.error("You must type a number different from 0, try again! + ERROR: {})", e.getMessage());
            }
        }


    }
}
