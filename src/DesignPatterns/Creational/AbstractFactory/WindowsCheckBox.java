package DesignPatterns.Creational.AbstractFactory;

public class WindowsCheckBox implements  CheckBox{
    @Override
    public void paint() {
        System.out.println("Painting a Windows checkbox");
    }

    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}
