import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Guess a number between 1 to 100");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int computerNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < 6) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == computerNumber) {
                    System.out.println("Congratulations! You guessed the number " + computerNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < computerNumber) {
                    System.out.println("The number you've entered is low");
                } else {
                    System.out.println("The number you've entered is high");
                }
            }

            if (attempts >= 6) {
                System.out.println("Oops, you've run out of attempts. The correct number is " + computerNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        scanner.close();
    }
}