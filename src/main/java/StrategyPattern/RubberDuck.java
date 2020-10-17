package StrategyPattern;

import java.util.function.Predicate;

public class RubberDuck extends Duck{

    @Override
    public String quack(){
        return this.squeak();
    }

    public String squeak(){
        return "Squeak";
    }

    public String display() {
        return "looks like a rubberDuck";
    }
}
