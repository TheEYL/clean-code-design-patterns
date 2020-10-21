package DecoratorPattern

import org.assertj.core.api.BDDAssertions
import spock.lang.Ignore
import spock.lang.Specification

class BeveragesSpecifications extends Specification {

    def "different beverages should have different costs"() {
        given:
        Beverage beverage1 = new HouseBlend();
        Beverage beverage2 = new DarkRoast();
        Beverage beverage3 = new Decaf();
        Beverage beverage4 = new Espresso();
        expect:
        BDDAssertions.then(beverage1.cost())
        BDDAssertions.then(beverage2.cost())
        BDDAssertions.then(beverage3.cost())
        BDDAssertions.then(beverage4.cost())
    }

    def "cost of condiment calls cost of beverage"() {
        Beverage coffee = new DarkRoast()
        CondimentDecorator condimentDecorator1 = new Soy(coffee)
        CondimentDecorator condimentDecorator2 = new Whip(condimentDecorator1)
        expect:
        BDDAssertions.then(condimentDecorator2.cost()).isEqualTo((double)1.24)

    }


}
