package StrategyPattern

import StrategyPattern.Duck
import StrategyPattern.Hunter
import StrategyPattern.MallardDuck
import StrategyPattern.RedheadDuck

import StrategyPattern.RubberDuck
import StrategyPattern.interfaceImplementations.FlyWithRocket

import spock.lang.Specification
import org.assertj.core.api.*;

class DuckSpecification extends Specification {

    def "real ducks should quack"() {
        given:
            Duck md = new MallardDuck()
            Duck rd = new RedheadDuck()
            String quack = md.performQuack()
            String rdQuack = rd.performQuack()
        expect:
            BDDAssertions.then(quack).isEqualTo("Quack...! Quack!")
            BDDAssertions.then(rdQuack).isEqualTo("Quack...! Quack!")
    }

    def "mallard duck should look like a mallard"(){
        given:
            Duck md = new MallardDuck()

        expect:
            BDDAssertions.then(md.display()).isEqualTo("Looks like a mallard")
    }

    def "redheadduck should look like a redhedduck" () {
        given:
            Duck rd = new RedheadDuck()
        expect:
            BDDAssertions.then(rd.display()).isEqualTo("Looks like a redhead duck")
            BDDAssertions.then(rd.display()).contains("redhead")
    }


    def "RubberDuck should squeak" ( ) {
        given :
        Duck rd= new RubberDuck()
        expect:
            BDDAssertions.then(rd.performQuack()).contains("Squeak")
    }

    def "RubberDuck should look like a rubberDuck" () {
        given:
        Duck rd = new RubberDuck()
        expect:
            BDDAssertions.then(rd.display()).contains("rubberDuck")
    }

    def "Rubberduck should not fly" () {
        given:
            Duck rd  = new RubberDuck()
        expect:
            BDDAssertions.then(rd.performFly()).isEqualTo("Do nothing -can't fly")
    }

    def "Duck should be rocket-powered"() {
        given:
            Duck duck = new FlyWithRocket.RocketPoweredDuck()
        expect:
            BDDAssertions.then(duck.performFly()).contains("rocket powered")
    }

    def "Hunter can quack" () {
        given:
        Hunter hunter = new Hunter()
        expect:
            BDDAssertions.then(hunter.quack()).contains("Quack")
    }
}
