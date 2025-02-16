import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        boolean playAgain = true;

        while (playAgain) {
            int userWins = 0, computerWins = 0, ties = 0;
            System.out.println("\n Welcome to Rock-Paper-Scissors (Best of 3)");

            while (userWins < 2 && computerWins < 2) { 
                String userChoice;
                
                while (true) {
                    System.out.print("\nEnter Rock, Paper, or Scissors: ");
                    userChoice = scanner.nextLine().trim(); 
                    
                    if (userChoice.equalsIgnoreCase("Rock") || 
                        userChoice.equalsIgnoreCase("Paper") || 
                        userChoice.equalsIgnoreCase("Scissors")) {
                        break; 
                    } else {
                        System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
                    }
                }

                int computerIndex = random.nextInt(3);
                String computerChoice = choices[computerIndex];
                System.out.println("Computer chose: " + computerChoice);

                if (userChoice.equalsIgnoreCase(computerChoice)) {
                    System.out.println("It's a tie!");
                    ties++;
                } else if (
                    (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                    (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                    (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
                ) {
                    System.out.println("You win this round!");
                    userWins++;
                } else {
                    System.out.println("You lose this round!");
                    computerWins++;
                }

                System.out.println("Score: You [" + userWins + "] - Computer [" + computerWins + "] - Ties [" + ties + "]");
            }

           
            if (userWins == 2) {
                System.out.println("\n Congratulations! You won the best of 3 series!");
            } else {
                System.out.println("\n The computer won the best of 3 series. Better luck next time!");
            }

            System.out.print("\n Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close(); 
    }
}
