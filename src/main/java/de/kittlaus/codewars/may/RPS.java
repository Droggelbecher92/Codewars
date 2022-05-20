package de.kittlaus.codewars.may;

public class RPS {

    private static final String W1 = "Player 1 won!";
    private static final String W2 = "Player 2 won!";

    public static String rps(String p1, String p2) {
        return (p1.equals(p2)) ? "Draw!" :
        switch (p1){
            case "scissors" ->  p2.equals("rock") ?  W2 :  W1;
            case "paper" -> p2.equals("scissors") ?  W2 :  W1;
            case "rock" -> p2.equals("paper") ?  W2 :  W1;
            default -> "";
        };
    }
}
