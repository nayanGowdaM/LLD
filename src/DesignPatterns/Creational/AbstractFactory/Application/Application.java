package DesignPatterns.Creational.AbstractFactory.Application;

import DesignPatterns.Creational.AbstractFactory.Products.Button.Button;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.CheckBox;
import DesignPatterns.Creational.AbstractFactory.Factory.GUIFactory;

public class Application {
    Button button;
    CheckBox checkBox;
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void renderGUI() {
        button.paint();
        checkBox.paint();
    }
}
