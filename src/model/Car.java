package model;

import interfaces.Transportation;

public class Car implements Transportation {

    @Override
    public int cost() {
        return 500;
    }

}
