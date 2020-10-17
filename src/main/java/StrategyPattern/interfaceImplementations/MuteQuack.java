package StrategyPattern.interfaceImplementations;

import StrategyPattern.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "do nothing - can't quack";
    }
}
