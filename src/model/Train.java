package model;

import interfaces.Transportation;

public class Train implements Transportation {

    @Override
    public int cost() {
        return 400;
    }
}
