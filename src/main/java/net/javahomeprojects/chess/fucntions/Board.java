package net.javahomeprojects.chess.fucntions;

public class Board {
    private String[][] board;

    public Board() {
        this.board = new String[8][8];
        board[0][0] = "bT";
        board[0][1] = "bH";
        board[0][2] = "bB";
        board[0][3] = "bQ";
        board[0][4] = "bK";
        board[0][5] = "bB";
        board[0][6] = "bH";
        board[0][7] = "bT";
        board[7][0] = "wT";
        board[7][1] = "wH";
        board[7][2] = "wB";
        board[7][3] = "wQ";
        board[7][4] = "wK";
        board[7][5] = "wB";
        board[7][6] = "wH";
        board[7][7] = "wT";
        for (int i = 0; i <=7; i++) {
            board[1][i] = "bP";
        }
        for (int i = 0; i <=7; i++) {
            board[6][i] = "wP";
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
}
