package DesignPatterns.Creational.AbstractFactory.Factory;

import DesignPatterns.Creational.AbstractFactory.Products.Button.Button;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.CheckBox;
import DesignPatterns.Creational.AbstractFactory.Products.Button.LinuxButton;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.LinuxCheckBox;

public class LinuxFactory implements GUIFactory {
    /**
     * @return LinuxButton
     */
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    /**
     * @return LinuxCheckBox
     */
    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
