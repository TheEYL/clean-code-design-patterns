package StrategyPattern;

import StrategyPattern.interfaceImplementations.FlyWithWings;
import StrategyPattern.interfaceImplementations.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    public String display() {
        return "Looks like a redhead duck";
    }
}
