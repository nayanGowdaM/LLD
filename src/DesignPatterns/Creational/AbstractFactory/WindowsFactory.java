package DesignPatterns.Creational.AbstractFactory;

public class WindowsFactory implements  GUIFactory{
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
