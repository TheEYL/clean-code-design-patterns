package StrategyPattern;

import StrategyPattern.interfaceImplementations.Quack;
import StrategyPattern.interfaces.QuackBehaviour;

public class Hunter {
    QuackBehaviour quackBehaviour;
    public Hunter(){
        this.quackBehaviour = new Quack();
    }

    public String quack(){
        return  this.quackBehaviour.quack();
    }
}
