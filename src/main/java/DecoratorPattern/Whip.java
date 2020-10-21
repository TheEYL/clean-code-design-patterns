package DecoratorPattern;

public class Whip extends CondimentDecorator {
    double cost = .10;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost(){
        return this.cost + beverage.cost();
    }
}
