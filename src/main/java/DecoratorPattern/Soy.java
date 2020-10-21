package DecoratorPattern;

public class Soy extends CondimentDecorator{

   double cost = .15;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost(){
        return this.cost + beverage.cost();
    }
}
