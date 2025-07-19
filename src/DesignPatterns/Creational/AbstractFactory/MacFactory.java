package DesignPatterns.Creational.AbstractFactory;

public class MacFactory implements  GUIFactory{
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
