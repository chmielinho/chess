package net.javahomeprojects.chess;

import net.javahomeprojects.chess.functions.Board;
import net.javahomeprojects.chess.functions.Player;

import java.util.Scanner;

import static net.javahomeprojects.chess.functions.Ui.*;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        int counter = 0;
        int end = 1;


        //Creating players
        System.out.print("Player 1 name: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Player 2 name: ");
        Player player2 = new Player(sc.nextLine());

        //Draw player
        Player firstPlayer = drawPlayer(player1, player2);
        Player secondPlayer = (player1.getColor().equals("w")) ? player2 : player1;

        //Print players data
        System.out.println(player1.getName() + ", " + player1.getColor() + " || " + player2.getName() + ", " + player2.getColor());
        System.out.println();

        //rozpoczęcie gry
        while (end == 1) {
            printBoard(board.getBoard(), player1, player2);

            //Check current player
            Player currentPlayer = (counter % 2 == 0) ? firstPlayer : secondPlayer;

            //move
            System.out.print(currentPlayer.getName() + ", wybierz: ");
            String currentPosition = sc.nextLine();
            int[] match = matcher(currentPosition);
            while (match[0] == 2 || match[1] == 2 || currentPosition.length() > 2 || currentPosition.length() == 0) {
                System.out.print(currentPlayer.getName() + " nie poprawne pole, podaj prawidłowe współrzędne : ");
                currentPosition = sc.nextLine();
                match = matcher(currentPosition);
            }
            String currentValue = board.getBoard()[match[2]][match[3]];

            System.out.print("Ruch na: ");
            String newPosition = sc.nextLine();
            int[] match1 = matcher(newPosition);
 while (match1[0] == 2 || match1[1] == 2 || newPosition.length() > 2 || newPosition.length() == 0 || !checkMove(match, match1, board)) {
                System.out.print(currentPlayer.getName() + " nie poprawne pole, podaj prawidłowe współrzędne : ");
                newPosition = sc.nextLine();
                match1 = matcher(newPosition);
            }

            //zapisywanie pobitej figury
            currentPlayer.setTableVal(board.getBoard()[match1[2]][match1[3]]);

            //przypisywanie nowych wartosci
            board.setBoardValue(match1[2], match1[3], currentValue);
            board.setBoardValue(match[2], match[3], null);

            //zwiekszanie licznika partii
            counter++;

            System.out.print("End game ? (0 yes, 1 no): ");
            end = sc.nextInt();
            sc.nextLine();

        }


    }
}
