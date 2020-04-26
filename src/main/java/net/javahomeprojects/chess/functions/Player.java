package net.javahomeprojects.chess.functions;

public class Player {
    String[] tableBeated = new String[16];
    private final String name;
    private String color;

    public Player(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTableVal(String value) {
        int id = 0;
        while (this.tableBeated[id] != null) {
            id++;
        }
        this.tableBeated[id] = value;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String[] getTable() {
        return tableBeated;
    }

}
