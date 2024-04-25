package LLDTicTacToe;

import LLDTicTacToe.Model.Board;
import LLDTicTacToe.Model.Player;
import LLDTicTacToe.Model.PlayingPieceO;
import LLDTicTacToe.Model.PlayingPieceX;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacTeo {
    ArrayList<Player> playerList;
    Board gameBoard;
    public void initializeGame(){
        playerList = new ArrayList<>();
        PlayingPieceX cross = new PlayingPieceX();
        PlayingPieceO zero = new PlayingPieceO();

        Player player1 = new Player("abhijit",cross);
        Player player2 = new Player("pragati",zero);

        playerList.add(player1);
        playerList.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        int playerTurn = 0;
        int totalPlayers = playerList.size();

        while(noWinner){
            int currentPlayerIndex = playerTurn%totalPlayers;
            Player currentPlayer = playerList.get(currentPlayerIndex);

            gameBoard.printBoard();

            List<Pair<Integer,Integer>> freeSpaceList = gameBoard.getFreeSpaceList();

            if(freeSpaceList.size() == 0){
                noWinner = false;
                break;
            }

            System.out.println("Player:" + currentPlayer.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
//            System.out.println(inputRow+" "+inputColumn);
            //check if that inputRow and inputColumn match the freeSpaceList

            boolean isValidMove = gameBoard.checkValidMove(inputRow, inputColumn);

            if(!isValidMove){
                System.out.println("invalid move, please try again......");
                continue;
            }

            gameBoard.setMove(inputRow, inputColumn, currentPlayer);

//            gameBoard.printBoard();

            boolean checkWinner = gameBoard.checkWinner();

            if(checkWinner){
                noWinner = false;
                return currentPlayer.name;
            }

            playerTurn++;

        }
        return "this match is a tie";
    }







}
