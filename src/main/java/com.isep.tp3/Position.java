package com.isep.tp3;

public class Position {
    private int x, y;
    private int row;
    private char column;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.column = (char) x;
        this.row = y;
    }

    private String getCharForNumber(int i) {
        return i >= 0 && i < 26 ? String.valueOf((char) (i + 96)) : null;
    }

    @Override
    public String toString() {
        return getCharForNumber(x) + (y);
    }
}
