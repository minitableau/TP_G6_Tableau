package com.isep.tp3;

public class Main {
    public static void main(String[] args) {

    }

    public class Player {
        //Attributs
        private String name;
        private int color;

        public Player(String name, int color) {
            this.name = name;
            this.color = color;
        }
    }

    public class Position {
        //Attributs
        private String column;
        private int row;

        //Méthodes
        public String toString() {
            String Srow = String.valueOf(row);
            String place = column + Srow;
            return place;
        }

        public Position(String column, int row) {
            this.column = column;
            this.row = row;
        }

    }

    public class Cell {
        final Position position;
        boolean isEmpty;

        public Cell(Position position) {
            this.position = position;

        }
    }

    public class Board {
        private Cell[][] chessBoard;

        public Board(int xDim, int yDim) {
            chessBoard = new Cell[xDim][yDim];
        }
    }

    public class King {
        Position position;
        private int color;
    }

    public boolean isValidMove(Position newPosition, Cell[][] board) {

        return false;
    }

    public String toString() {
        return "K";
    }

    class Queen {
        Position position;
        private int color;

        public String toString() {
            return "Q";
        }
    }

    class Bishop {
        Position position;
        private int color;

        public String toString() {
            return "B";
        }
    }

    class Knight {
        Position position;
        private int color;

        public String toString() {
            return "N";
        }
    }

    class Rook {
        Position position;
        private int color;

        public String toString() {
            return "R";
        }
    }

    class Pawn {
        Position position;
        private int color;

        public String toString() {
            return "P";
        }
    }

}
