package model;

import interfaces.Transportation;

public class Plane implements Transportation {

    @Override
    public int cost() {
        return 1000;
    }
}
