package net.javahomeprojects.chess;

import net.javahomeprojects.chess.fucntions.Board;
import net.javahomeprojects.chess.fucntions.Player;

import static net.javahomeprojects.chess.fucntions.Ui.printBoard;

public class Starter {
    public static void main(String[] args) {
        Player player1 = new Player("Mateusz", "b");
        Player player2 = new Player("Karina", "w");
        Board board = new Board();

        printBoard(board.getBoard(), player1, player2);


    }
}
