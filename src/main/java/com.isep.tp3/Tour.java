package com.isep.tp3;

public class Tour extends Piece {
    public Tour(char couleur) {
        super('R', couleur);

    }

    public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
        boolean valid = false;

        if ((xOrig == xDest && yOrig != yDest) || (xOrig != xDest && yOrig == yDest)) {
            valid = true;
        }

        return valid;
    }
}
