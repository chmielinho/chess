package net.javahomeprojects.chess.functions;

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
        board[7][0] = " T";
        board[7][1] = " H";
        board[7][2] = " B";
        board[7][3] = " Q";
        board[7][4] = " K";
        board[7][5] = " B";
        board[7][6] = " H";
        board[7][7] = " T";
        for (int i = 0; i <=7; i++) {
            board[1][i] = "bP";
        }
        for (int i = 0; i <=7; i++) {
            board[6][i] = " P";
        }
    }

    public void setBoardValue(int verse, int column, String value) {
        this.board[verse][column] = value;
    }

    public String[][] getBoard() {
        return board;
    }

}
