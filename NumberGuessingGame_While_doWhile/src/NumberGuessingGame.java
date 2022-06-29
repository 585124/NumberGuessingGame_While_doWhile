import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
/*
**********
* While og do While loops
* FERDIG SPILL!!
**********
 */


    public static void main(String[] args) {
        //whileLoop();

        guessingGame();


    }

    private static void guessingGame() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        while (true) {
            System.out.println("Enter your guess (1-100): ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber){
                System.out.println("Correct, you win!");
                break;
            } else if (playerGuess < randomNumber){
                System.out.println("Nope! The number is higher");
            } else{
                System.out.println("Nope! The number is lower");
            }
        }
    }

    private static void whileLoop() {
        // do While Loop. Denne vil alltid kjøres minst en gang.
        int counter = 0;
        do {
            System.out.println("Hello!");
            if (counter == 5){
                break;
            }
            counter++;
        }while (counter < 10);

        //While loop
        /*int counter = 0;
        while (counter < 10); {
            System.out.println("Hello!");
            counter++;
            }*/
    }


}

