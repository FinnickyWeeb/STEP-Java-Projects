package Week1PracticeProblems;

import java.util.*;

public class Week1Q1RockPaperScissors {

    static String playRound(String player, String computer) {
        if (player.equalsIgnoreCase(computer))
            return "Draw";

        if ((player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
                (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
                (player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        System.out.print("Enter number of rounds: ");
        int n = sc.nextInt();

        System.out.println("\nRound | Player | Computer | Result");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter your move: ");
            String player = sc.next();

            String computer = moves[random.nextInt(3)];

            String result = playRound(player, computer);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;

            System.out.println(i + " | " + player + " | " + computer + " | " + result);
        }

        double winPercentage = (wins * 100.0) / n;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");
    }
}