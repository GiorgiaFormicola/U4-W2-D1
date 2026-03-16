package exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = new int[5];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(1, 10);
            logger.debug("Random number for index {} = {}", i, String.valueOf(arrayOfNumbers[i]));
        }

        logger.info("Array filled with random numbers: {}", Arrays.toString(arrayOfNumbers));

        while (true) {
            System.out.println("Type the number you'd like to insert (from 1 to 10) or quit (0):");
            try {
                int numberToInsert = Integer.parseInt(scanner.nextLine());
                if (numberToInsert == 0) break;
                if (numberToInsert < 0 || numberToInsert > 10) { //Custom Exception?
                    logger.error("The chosen number must be bigger than 1 and smaller than 10!");
                    continue;
                }
                System.out.println("Type the index to insert your number in the array (from 0 to 4):");
                int index = Integer.parseInt(scanner.nextLine());
                arrayOfNumbers[index] = numberToInsert;
                logger.info("Array successfully modified: {}", Arrays.toString(arrayOfNumbers));
            } catch (NumberFormatException e) {
                logger.error("You must type an integer number, try again! (ERROR: {})", e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("You must type a number from 0 to 4, try again! (ERROR: {})", e.getMessage());
            }
        }
    }
}
