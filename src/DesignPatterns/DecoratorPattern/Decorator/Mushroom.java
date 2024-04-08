package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends Toppings{
    BasePizza basePizza;

    public  Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
        return basePizza.cost() + 20;
    }
}
