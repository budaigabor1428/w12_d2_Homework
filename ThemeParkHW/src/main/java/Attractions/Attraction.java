package Attractions;

import People.ITicketed;
//import People.Visitor;

public abstract class Attraction implements ITicketed {

    private String name;
    protected double price;

    public Attraction (String name) {

        this.name = name;
        this.price = 0;

    }

    public String getName () {
        return this.name;
    }


    public double getPrice() {
         return this.price;
    }

}
