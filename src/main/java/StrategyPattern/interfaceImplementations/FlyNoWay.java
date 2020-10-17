package StrategyPattern.interfaceImplementations;

import StrategyPattern.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public String fly() {
        return "Do nothing -can't fly";
    }
}
