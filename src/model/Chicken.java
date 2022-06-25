package model;

import bean.Animal;

public class Chicken extends Animal {

    @Override
    public double money() {
        // if not case to double, will return 0.0
        return (double) 1/3;
    }
}
