package DesignPatterns.Creational.AbstractFactory.Products.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting a Linux checkbox");
    }

    @Override
    public void check() {
        System.out.println("Linux checkbox checked");
    }
}
