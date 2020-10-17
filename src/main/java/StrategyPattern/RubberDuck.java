package StrategyPattern;

import StrategyPattern.interfaceImplementations.FlyNoWay;
import StrategyPattern.interfaceImplementations.Squeak;

import java.util.function.Predicate;

public class RubberDuck extends Duck{

    public RubberDuck(){
       this.flyBehaviour = new FlyNoWay();
       this.quackBehaviour = new Squeak();
    }


    public String display() {
        return "looks like a rubberDuck";
    }
}
