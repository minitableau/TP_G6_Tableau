package com.isep.tp3;

import java.lang.constant.Constable;

public class Player {
    private String name;
    private int couleur;

    public Player() {
    }

    public Player(String name, int couleur) {
        this.name = name;
        this.couleur = couleur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
