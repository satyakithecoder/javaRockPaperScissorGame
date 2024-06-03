import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("Welcome To Rock Paper Scissors Game!");
        System.out.println("Each Match Is Of 3 rounds");
        System.out.println("r -> Rock");
        System.out.println("p -> Paper");
        System.out.println("s -> Scissors");

        int player_Score = 0;
        int computer_Score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String[] choices = {"r", "p", "s"};
            String computer_choice = choices[(int) (Math.random() * choices.length)];

            System.out.println("Enter your choice (r/p/s):");
            String player_choice = scanner.next();

            if ((player_choice.equals("r") && computer_choice.equals("s")) ||
                    (player_choice.equals("p") && computer_choice.equals("r")) ||
                    (player_choice.equals("s") && computer_choice.equals("p"))) {
                player_Score++;
                System.out.println("You Won! Computer chose " + computer_choice + ". Your choice was " + player_choice + ".");
            } else if ((computer_choice.equals("r") && player_choice.equals("s")) ||
                    (computer_choice.equals("p") && player_choice.equals("r")) ||
                    (computer_choice.equals("s") && player_choice.equals("p"))) {
                computer_Score++;
                System.out.println("Computer Won! Computer chose " + computer_choice + ". Your choice was " + player_choice + ".");
            } else {
                System.out.println("It's a tie! Both chose " + player_choice + ".");
            }
        }

        System.out.println("Final Scores:");
        System.out.println("Your Score: " + player_Score);
        System.out.println("Computer Score: " + computer_Score);
        scanner.close();
    }
}