package DesignPatterns.Creational.AbstractFactory;

public class MacButton implements  Button{
    @Override
    public void paint() {
        System.out.println("Painting a Mac button");
    }

    @Override
    public void click() {
        System.out.println("Mac button clicked");
    }
}
