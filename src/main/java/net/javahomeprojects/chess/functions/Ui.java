package net.javahomeprojects.chess.functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                        sb.append(printBeatedTable(player1));
                    } else {
                        sb.append(printBeatedTable(player2));
                    }
                    break;
                }
                case 7: {
                    if (player1.getColor().equals("w")) {
                        sb.append(printBeatedTable(player1));
                    } else {
                        sb.append(printBeatedTable(player2));
                    }
                    break;
                }
            }

            System.out.println(sb);
            sb.setLength(0);
        }
    }

    public static String printBeatedTable(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(player.getName()).append(" beaten:");
        for (String value : player.getTable()) {
            if (value != null) {
                sb.append(" ").append(value).append(",");
            }
        }
        return sb.toString();
    }

    public static Player drawPlayer(Player player1, Player player2) {
        if (Math.random() >= 0.5) {
            player2.setColor("w");
            player1.setColor("b");
            return player2;
        } else {
            player1.setColor("w");
            player2.setColor("b");
            return player1;
        }
    }

    public static int[] matcher(String target) {
        int column = 0, verse = 0;
        int counter1 = 0;
        int counter2 = 0;
        Matcher matcher1 = Pattern.compile("\\D").matcher(target);
        while (matcher1.find()) {
            String firsts = target.substring(matcher1.start(), matcher1.end());
            switch (firsts) {
                case "A":
                case "a":
                    column = 0;
                    break;
                case "B":
                case "b":
                    column = 1;
                    break;
                case "C":
                case "c":
                    column = 2;
                    break;
                case "D":
                case "d":
                    column = 3;
                    break;
                case "E":
                case "e":
                    column = 4;
                    break;
                case "F":
                case "f":
                    column = 5;
                    break;
                case "G":
                case "g":
                    column = 6;
                    break;
                case "H":
                case "h":
                    column = 7;
                    break;
                default:
                    counter1++;
                    break;
            }
            counter1++;
        }
        Matcher matcher2 = Pattern.compile("\\d").matcher(target);
        while (matcher2.find()) {
            if (Integer.parseInt(target.substring(matcher2.start(), matcher2.end())) > 8) {
                counter2++;
            }
            verse = Integer.parseInt(target.substring(matcher2.start(), matcher2.end())) - 1;
            counter2++;
        }
        return new int[]{counter1, counter2, verse, column};
    }

}
