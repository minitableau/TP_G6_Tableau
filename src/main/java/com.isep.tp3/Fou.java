package com.isep.tp3;

public class Fou extends Piece {

    public Fou(char couleur) {
        super('B', couleur);
    }

    public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
        boolean valid = false;

        int dx = xOrig - xDest;
        int dy = yOrig - yDest;

        if ((dx == dy) || (dx == -dy)) {
            valid = true;
        }

        return valid;
    }
}
