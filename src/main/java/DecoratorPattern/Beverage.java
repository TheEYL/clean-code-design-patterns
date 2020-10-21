package DecoratorPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
    private String description;
    public abstract double cost() ;

}
