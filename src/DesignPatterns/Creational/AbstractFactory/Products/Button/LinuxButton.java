package DesignPatterns.Creational.AbstractFactory.Products.Button;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Linux button");
    }

    @Override
    public void click() {
        System.out.println("Linux button clicked");
    }
}
