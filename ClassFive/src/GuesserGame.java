import java.util.Scanner;

// Guesser class: picks the number
class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser, please guess the number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Player class: each player guesses a number
class Player {
    int guessNum;

    int guessingNumber(int playerNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player " + playerNumber + ", please guess the number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Umpire class: coordinates the game
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber(1);
        numFromPlayer2 = p2.guessingNumber(2);
        numFromPlayer3 = p3.guessingNumber(3);
    }

    void compare() {
        System.out.println("\n--- Results ---");
        if (numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
            System.out.println("All players won the game!");
        } else if (numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser) {
            System.out.println("Player 1 and Player 2 won the game!");
        } else if (numFromPlayer1 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 1 and Player 3 won the game!");
        } else if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 2 and Player 3 won the game!");
        } else if (numFromPlayer1 == numFromGuesser) {
            System.out.println("Player 1 won the game!");
        } else if (numFromPlayer2 == numFromGuesser) {
            System.out.println("Player 2 won the game!");
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 3 won the game!");
        } else {
            System.out.println("No players guessed correctly. Game over!");
        }
    }
}

// Main class
public class GuesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
