package StrategyPattern;

import StrategyPattern.interfaceImplementations.FlyWithWings;
import StrategyPattern.interfaceImplementations.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehaviour=new FlyWithWings();
        this.quackBehaviour= new Quack();
    }
    public String display(){
        return "Looks like a mallard";
    }
}

