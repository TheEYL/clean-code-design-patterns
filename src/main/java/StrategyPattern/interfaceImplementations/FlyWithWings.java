package StrategyPattern.interfaceImplementations;

import StrategyPattern.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public String fly() {
        return "This duck is flying";
    }
}
