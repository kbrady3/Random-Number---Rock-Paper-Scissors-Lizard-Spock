//Kabrina Brady

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsBrady {
    public static void main(String[] args) {
        String selection;
        String selection2;
        String result;
        int rand;
        Scanner input = new Scanner(System.in);

        System.out.println("Player 1: Type 'rock', 'paper', 'scissors', 'spock', or 'lizard'.");
        selection = input.next();

        //Generates a random number between 1 and 5
        rand = (int) (Math.random() * 5) + 1;

        //Passes random number to numToWord to be changed to corresponding word and assigns to selection2
        selection2 = numToWord(rand);

        System.out.println("Player 2: " + selection2);

        selection = selection.toLowerCase();

        result = Winner(selection, selection2);

        System.out.println(result);
    }

    public static String Winner(String selection, String selection2){
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String spock = "spock";
        String lizard = "lizard";
        String playerOneWon = "Player 1 won!";
        String playerTwoWon = "Player 2 won!";
        String tie = "It's a tie!";
        String error = "Error";

        switch (selection){
            case "rock":
                return switch (selection2) {
                    case "rock" -> tie;
                    case "paper" -> playerTwoWon;
                    case "scissors" -> playerOneWon;
                    case "spock" -> playerTwoWon;
                    case "lizard" -> playerOneWon;
                    default -> error;
                };
            case "paper":
                return switch (selection2) {
                    case "rock" -> playerOneWon;
                    case "paper" -> tie;
                    case "scissors" -> playerTwoWon;
                    case "spock" -> playerOneWon;
                    case "lizard" -> playerTwoWon;
                    default -> error;
                };
            case "scissors":
                return switch (selection2){
                    case "rock" -> playerTwoWon;
                    case "paper" -> playerOneWon;
                    case "scissors" -> tie;
                    case "spock" -> playerTwoWon;
                    case "lizard" -> playerOneWon;
                    default -> error;
                };
            case "spock":
                return switch (selection2){
                    case "rock" -> playerOneWon;
                    case "paper" -> playerTwoWon;
                    case "scissors" -> playerOneWon;
                    case "spock" -> tie;
                    case "lizard" -> playerTwoWon;
                    default -> error;
                };
            case "lizard":
                return switch (selection2){
                    case "rock" -> playerTwoWon;
                    case "paper" -> playerOneWon;
                    case "scissors" -> playerTwoWon;
                    case "spock" -> playerOneWon;
                    case "lizard" -> tie;
                    default -> error;
                };
            default:
                return error;
        }
    }

    public static String numToWord(int rand){
        String value;

        switch(rand){
            case 1:
                value = "rock";
                return value;
            case 2:
                value = "paper";
                return value;
            case 3:
                value = "scissors";
                return value;
            case 4:
                value = "lizard";
                return value;
            case 5:
                value = "spock";
                return value;
            default:
                return "Error";
        }
    }
}