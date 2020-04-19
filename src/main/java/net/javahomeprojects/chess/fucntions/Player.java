package net.javahomeprojects.chess.fucntions;

public class Player {
    String[] table = new String[16];
    private final String name;
    private final String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String[] getTable() {
        return table;
    }

    public void setTableVal(String value) {
        int id = 0;
        while (this.table[id] != null) {
            id++;
        }
        this.table[id] = value;
    }
}
