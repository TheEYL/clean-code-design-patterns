import StrategyPattern.Duck
import StrategyPattern.MallardDuck
import StrategyPattern.RedheadDuck
import StrategyPattern.RubberDuck
import spock.lang.Specification
import org.assertj.core.api.*;

class DuckSpecification extends Specification {

    def "duck should quack"() {
        given:
            MallardDuck md = new MallardDuck()
            RedheadDuck rd = new RedheadDuck()
            String quack = md.quack()
            String rdQuack = rd.quack()
        expect:
            BDDAssertions.then(quack).isEqualTo("Quack...! Quack!")
            BDDAssertions.then(rdQuack).isEqualTo("Quack...! Quack!")
    }

    def "mallard duck should look like a mallard"(){
        given:
            MallardDuck md = new MallardDuck()

        expect:
            BDDAssertions.then(md.display()).isEqualTo("Looks like a mallard")
    }

    def "redheadduck should look like a redhedduck" () {
        given:
            RedheadDuck rd = new RedheadDuck()
        expect:
            BDDAssertions.then(rd.display()).isEqualTo("Looks like a redhead duck")
            BDDAssertions.then(rd.display()).contains("redhead")
    }

    def "Ducks should fly" () {
        given:
            Duck duck  = new Duck()
        expect:
            BDDAssertions.then(duck.fly()).contains("flying")
    }

    def "RubberDuck should squeak" ( ) {
        given :
        RubberDuck rd= new RubberDuck()
        expect:
            BDDAssertions.then(rd.quack()).contains("Squeak")
    }

    def "RubberDuck should look like a rubberDuck" () {
        given:
        RubberDuck rd = new RubberDuck()
        expect:
            BDDAssertions.then(rd.display()).contains("rubberDuck")
    }

    def "Rubberduck should not fly" () {
        given:
            RubberDuck rd  = new RubberDuck()
        expect:
            BDDAssertions.then(rd.fly()).isEqualTo("Plastic does not fly")
    }
}
