package DecoratorPattern;

public class CondimentDecorator  extends  Beverage{
    Beverage beverage;

    @Override
    public double cost() {
        return 0;
    }
}
