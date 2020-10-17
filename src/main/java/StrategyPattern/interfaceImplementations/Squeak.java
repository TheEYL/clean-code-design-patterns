package StrategyPattern.interfaceImplementations;

import StrategyPattern.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    public String quack(){
        return "Squeak";
    }
}
