package com.isep.tp3;

public abstract class Piece {

    private char couleur;
    private char type;
    private Position position;

    public Piece(char type, char couleur) {
        this.type = type;
        this.couleur = couleur;
    }

    public String toString() {
        String res = "" + this.type + this.couleur;
        return res;
    }

    public char getType() {
        return type;
    }

}
