import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

       /* 1. Generate a random number within a specified range, such as 1 to 100.

        2. Prompt the user to enter their guess for the generated number.

        3. Compare the user's guess with the generated number and provide feedback on whether the guess
        is correct, too high, or too low.

        4. Repeat steps 2 and 3 until the user guesses the correct number.

                You can incorporate additional details as follows:

        5. Limit the number of attempts the user has to guess the number.
        6. Add the option for multiple rounds, allowing the user to play again.
        7. Display the user's score, which can be based on the number of attempts taken or rounds won.
        */
        int attempt = 0;
        int guess;
        int RandomNumber;
        int limit = 5;
        RandomNumber = random.nextInt(1, 100);
        System.out.println("Guess a number between (1 - 100) :");
        System.out.println("You have a minimum of 5 attempts.");

        do {
            System.out.println("Enter a guess  :");

            guess = sc.nextInt();
            attempt++;

            if (guess < RandomNumber) {
                System.out.println("The guess is too low Try again!!!");
            } else if (guess > RandomNumber) {
                System.out.println("The guess is too high Try again!!!");
            } else {
                System.out.println("The guess is correct!!!");
                System.out.println("Number of Attempts : " + attempt);
            }

            continue;

        } while (guess != RandomNumber && attempt < 5);
        {
            if (guess > limit) {
                System.out.println("Number of attempts exceeds You loose !!!");
            } else {
                System.out.println("You Won");
            }

        }




    }
}



