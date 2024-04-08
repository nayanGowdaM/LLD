package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return basePizza.cost() + 10;
    }
}
