package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insert the number of kilometers travelled:");
            try {
                /*int km = Integer.parseInt(scanner.nextLine());*/
                /*int km = scanner.nextInt();*/

                double km = Double.parseDouble(scanner.nextLine());
                /*double km = scanner.nextDouble();*/

                System.out.println("Insert the liters of fuel consumed:");

                /*int liters = Integer.parseInt(scanner.nextLine());*/
                /*int liters = scanner.nextInt();*/

                double liters = Double.parseDouble(scanner.nextLine());
                /*double liters = scanner.nextDouble();*/

                /*int kmPerLiter = km / liters;*/
                double kmPerLiter = km / liters;
                
                System.out.println("The kilometers per liter travelled are " + kmPerLiter);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must type a number, try again! + ERROR: " + e.getMessage() + ")");
                continue;
            } catch (ArithmeticException e) {
                System.out.println("You must type a number different from 0, try again! + ERROR: " + e.getMessage() + ")");
            }
        }


    }
}
