import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the secret number " + secretNumber + " in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            }
        }
        
        scanner.close();
    }
}