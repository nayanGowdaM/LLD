package DesignPatterns.Creational.AbstractFactory.Factory;

import DesignPatterns.Creational.AbstractFactory.Products.Button.Button;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.CheckBox;
import DesignPatterns.Creational.AbstractFactory.Products.Button.WindowsButton;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    /**
     * @return WindowsButton
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * @return WindowsCheckBox
     */
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
