package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Decorator.ExtraCheese;
import DesignPatterns.DecoratorPattern.Decorator.Mushroom;
import DesignPatterns.DecoratorPattern.Pizza.BasePizza;
import DesignPatterns.DecoratorPattern.Pizza.FarmHouse;

public class Main {
    public static void main(String[] args){
        BasePizza pizza = new Mushroom(new ExtraCheese(new FarmHouse()));
        System.out.println("Cost of Extracheese, Mushroom FarmHouse Pizza is " + pizza.cost());
    }
}
