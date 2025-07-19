package DesignPatterns.Creational.AbstractFactory.Products.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting a Mac checkbox");
    }

    @Override
    public void check() {
        System.out.println("Mac checkbox checked");
    }
}
