package com.isep.tp3;

public class Cell {
    private Piece contenue;
    private final Position position = null;

    public Cell(Piece contenue) {
        this.contenue = contenue;
    }

    public Cell() {
        this.contenue = null;
    }

    public boolean isEmpty() {
        return (contenue == null);
    }

    public char infoCase() {
        return contenue.getType();
    }
}
