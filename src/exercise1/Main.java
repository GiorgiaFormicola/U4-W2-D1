package exercise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = new int[5];

        /*for (int number : arrayOfNumbers) {
            number = random.nextInt(1, 10);
        }*/

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(1, 10);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        while (true) {
            System.out.println("Type the number you'd like to insert (from 1 to 10) or quit (0):");
            try {
                int numberToInsert = Integer.parseInt(scanner.nextLine());
                if (numberToInsert == 0) break;
                if (numberToInsert < 0 || numberToInsert > 10) { //Custom Exception?
                    System.out.println("The chosen number must be bigger than 1 and smaller than 10!");
                    continue;
                }
                System.out.println("Type the index to insert your number in the array (from 0 to 4):");
                int index = Integer.parseInt(scanner.nextLine());
                arrayOfNumbers[index] = numberToInsert;
                System.out.println(Arrays.toString(arrayOfNumbers));
            } catch (NumberFormatException e) {
                System.out.println("You must type a number, try again! (ERROR: " + e.getMessage() + ")");
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You must type a number from 0 to 4, try again! (ERROR: " + e.getMessage() + ")");
                continue;
            }
        }
    }
}
