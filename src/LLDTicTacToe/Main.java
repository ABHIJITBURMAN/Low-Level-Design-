package LLDTicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacTeo ticTacTeo = new TicTacTeo();
        ticTacTeo.initializeGame();
        System.out.println("game winner is: " + ticTacTeo.startGame());
    }
}
