package model;

import interfaces.Transportation;

public class Bus implements Transportation {

    @Override
    public int cost() {
        return 300;
    }
}
