package DesignPatterns.Creational.AbstractFactory.Products.Button;

public class WindowsButton implements Button {
    /**
     *
     */
    @Override
    public void paint() {
        System.out.println("Windows Button painted");
    }

    /**
     *
     */
    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }
}
