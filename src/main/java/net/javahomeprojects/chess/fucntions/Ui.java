package net.javahomeprojects.chess.fucntions;

public class Ui {

    public static void printBoard(String[][] board, Player player1, Player player2){
        StringBuilder sb = new StringBuilder();
        System.out.print("   a  b  c  d  e  f  g  h\n");
        for (int y = 0; y <= 7; y++) {
            sb.append(y+1).append(" ");
            for (int x = 0; x <= 7; x++) {

                if (board[y][x] == null) {
                    sb.append(String.format("|%s", "  "));
                } else {
                    sb.append(String.format("|%s", board[y][x]));
                }
            }
            sb.append("|");

            switch (y) {
                case 0: {
                    if (player1.getColor().equals("b")) {
                        sb.append(" ").append(player1.getName()).append(" beaten:");
                        for (String value : player1.getTable()) {
                            if (value != null) {
                                sb.append(" ").append(value).append(",");
                            }
                        }
                    } else {
                        sb.append(" ").append(player2.getName()).append(" beaten:");
                        for (String value : player2.getTable()) {
                            if (value != null) {
                                sb.append(" ").append(value).append(",");
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    if (player1.getColor().equals("w")) {
                        sb.append(" ").append(player1.getName()).append(" beaten:");
                        for (String value : player1.getTable()) {
                            if (value != null) {
                                sb.append(" ").append(value).append(",");
                            }
                        }
                    } else {
                        sb.append(" ").append(player2.getName()).append(" beaten:");
                        for (String value : player2.getTable()) {
                            if (value != null) {
                                sb.append(" ").append(value).append(",");
                            }
                        }
                    }
                    break;
                }
            }

            System.out.println(sb);
            sb.setLength(0);
        }
    }

}
