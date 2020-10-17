package StrategyPattern;

import java.util.function.Supplier;

public class Duck {
    public String quack(){
         Supplier<String> quack = () -> "Quack...! Quack!";
         return quack.get();
    };
    public String swim(){
        Supplier<String> swimmingSound = ()-> "...swmming Sounds";
        return swimmingSound.get();
    };

    public String fly() {
        return "This duck is flying";
    }
}

