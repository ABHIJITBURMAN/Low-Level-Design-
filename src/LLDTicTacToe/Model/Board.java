package LLDTicTacToe.Model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public Integer size;
    public PlayingPeices[][] board;

    public Board(Integer size){
        this.size = size;
        board = new PlayingPeices[size][size];
    }
    public void printBoard(){
        for(int i=0;i<this.board.length; i++){
            for(int j = 0; j<this.board[0].length; j++){
                if(this.board[i][j] != null){
                    System.out.print(this.board[i][j].pieceType+" ");
                }
                else {
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer,Integer>> getFreeSpaceList (){
        PlayingPeices[][] gameBoard = this.board;
        List<Pair<Integer,Integer>> freeSpaceList = new ArrayList<Pair<Integer, Integer>>();
        for(int i=0; i<gameBoard.length; i++){
            for(int j = 0; j<gameBoard[0].length; j++){
                if(gameBoard[i][j] ==  null ){
                    freeSpaceList.add(new Pair<Integer, Integer>(i,j));
                }
            }
        }
        return freeSpaceList;
    }

    public boolean checkValidMove( int row, int col){
        PlayingPeices[][] boardGame = this.board;
        PlayingPieceO zero = new PlayingPieceO();
        PlayingPieceX cross = new PlayingPieceX();
        if(row >= boardGame.length || col >= boardGame[0].length){
            return false;
        }
        if(boardGame[row][col]!=null){
            return false;
        }
        return true;
    }

    public void setMove(int row, int col, Player p){
        this.board[row][col] = p.playingPeices;
//        System.out.println("successfully done");
    }

    public boolean checkWinner(){
        PlayingPeices[][] boardGame = this.board;
        int size = this.size;
//        boolean isWin = false;
        boolean rowMatch = false;
        boolean colMatch = false;
        boolean diagonalMatch1 = false;
        boolean diagonalMatch2 = false;
        // virtical and horizental checks
        for(int i=0;i<boardGame.length; i++){
            int flag = 0;
            for(int j=0;j<boardGame.length-1;j++){
                if(boardGame[i][j] == null || boardGame[i][j] != boardGame[i][j+1]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                colMatch = true;
                break;
            }
        }

        for(int i=0;i<boardGame.length; i++){
            int flag = 0;
            for(int j=0;j<boardGame.length-1;j++){
                if(boardGame[j][i] == null || boardGame[j][i] != boardGame[j+1][i]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                rowMatch = true;
                break;
            }
        }


        // diagonal checks
        int flag = 0;
        for(int i=0; i<boardGame.length-1; i++){
           if(boardGame[i][i] == null || boardGame[i][i] != boardGame[i+1][i+1]){
               flag = 1;
               break;
           }
        }
        if(flag == 0){
            diagonalMatch1 = true;
        }

        flag = 0;
        for(int i=0; i<boardGame.length-1; i++){
            if(boardGame[i][size-1] == null || boardGame[i][size-1] != boardGame[i+1][size-2]){
                flag = 1;
                break;
            }
            size--;
        }

        if(flag == 0){
            diagonalMatch2 = true;
        }
        return rowMatch | colMatch | diagonalMatch1 | diagonalMatch2;
    }
}
