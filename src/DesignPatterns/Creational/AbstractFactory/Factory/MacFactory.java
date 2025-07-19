package DesignPatterns.Creational.AbstractFactory.Factory;

import DesignPatterns.Creational.AbstractFactory.Products.Button.Button;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.CheckBox;
import DesignPatterns.Creational.AbstractFactory.Products.Button.MacButton;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.MacCheckBox;

public class MacFactory implements GUIFactory {
    /**
     * @return MacButton
     */
    @Override
    public Button createButton() {
        return new MacButton();
    }

    /**
     * @return MacCheckBox
     */
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
