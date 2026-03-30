import java.util.Random;

public class SnakeAndLadder {
    private static final int BOARD_SIZE = 100;
    private static final int NUM_SNAKES = 5;
    private static final int NUM_LADDERS = 5;
    private static final int[] SNAKE_HEADS = { 99, 87, 55, 28, 21 };
    private static final int[] SNAKE_TAILS = { 16, 24, 41, 4, 8 };
    private static final int[] LADDER_STARTS = { 1, 9, 25, 44, 70 };
    private static final int[] LADDER_ENDS = { 38, 53, 65, 92, 80 };

    private int currentPlayerPosition;
    private Random random;

    public SnakeAndLadder() {
        currentPlayerPosition = 0;
        random = new Random();
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    private void checkForSnakesAndLadders() {
        for (int i = 0; i < NUM_SNAKES; i++) {
            if (currentPlayerPosition == SNAKE_HEADS[i]) {
                System.out.println("Oh no! You got bitten by a snake!");
                currentPlayerPosition = SNAKE_TAILS[i];
            }
        }

        for (int i = 0; i < NUM_LADDERS; i++) {
            if (currentPlayerPosition == LADDER_STARTS[i]) {
                System.out.println("Hooray! You found a ladder!");
                currentPlayerPosition = LADDER_ENDS[i];
            }
        }
    }

    private void playTurn() {
        int diceRoll = rollDice();
        System.out.println("You rolled a " + diceRoll + ".");

        if (currentPlayerPosition + diceRoll <= BOARD_SIZE) {
            currentPlayerPosition += diceRoll;
            checkForSnakesAndLadders();
            System.out.println("You are now at position " + currentPlayerPosition + ".");
        } else {
            System.out.println("Oops! You need " + (BOARD_SIZE - currentPlayerPosition) + " to win. Try again!");
        }
    }

    public void playGame() {
        System.out.println("Welcome to Snake and Ladder!");

        while (currentPlayerPosition < BOARD_SIZE) {
            System.out.println("It's your turn.");
            playTurn();
        }

        System.out.println("Congratulations! You reached the finish line!");
    }

    public static void main(String[] args) {
        SnakeAndLadder game = new SnakeAndLadder();
        game.playGame();
    }
}