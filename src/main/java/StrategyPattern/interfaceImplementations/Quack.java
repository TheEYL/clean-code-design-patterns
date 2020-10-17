package StrategyPattern.interfaceImplementations;

import StrategyPattern.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public String quack() {
         return "Quack...! Quack!";

    }
}
