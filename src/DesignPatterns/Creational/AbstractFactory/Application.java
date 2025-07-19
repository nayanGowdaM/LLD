package DesignPatterns.Creational.AbstractFactory;

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
