package Attractions;

import People.ISecurity;
import People.Visitor;

public class Playground extends Attraction implements ISecurity{

    public Playground(String name) {
        super(name);
    }


    public boolean isAlloweddTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
            return false;
        }
        return true;
    }

}
