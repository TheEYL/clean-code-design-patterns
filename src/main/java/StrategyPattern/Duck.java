package StrategyPattern;

import StrategyPattern.interfaces.FlyBehaviour;
import StrategyPattern.interfaces.QuackBehaviour;

import java.util.function.Supplier;

public class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public String swim(){
        Supplier<String> swimmingSound = ()-> "...swmming Sounds";
        return swimmingSound.get();
    };
    public String performQuack(){
        return quackBehaviour.quack();
    }
    public String performFly(){
        return flyBehaviour.fly();
    }
;
}

