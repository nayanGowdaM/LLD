package DesignPatterns.Creational.AbstractFactory.Factory;

import DesignPatterns.Creational.AbstractFactory.Products.Button.Button;
import DesignPatterns.Creational.AbstractFactory.Products.CheckBox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
