package StrategyPattern.interfaceImplementations;

import StrategyPattern.Duck;
import StrategyPattern.interfaces.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    public String fly() {
        return "rocket powered";
    }

    public static class RocketPoweredDuck extends Duck {
        public RocketPoweredDuck() {
            this.flyBehaviour = new FlyWithRocket();
        }
    }
}
