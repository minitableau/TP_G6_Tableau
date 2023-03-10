package com.isep.tp3;

public class Reine extends Piece {

    public Reine(char couleur) {
        super('Q', couleur);
    }

    public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
        boolean valid = false;

        int dx = xOrig - xDest;
        int dy = yOrig - yDest;

        if ((dx == dy) || (dx == -dy) || dx == 0 || dx == 0) {
            valid = true;
        }

        return valid;
    }
}
