package DesignPatterns.Creational.AbstractFactory;

public class ApplicationLaunch {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        os = "mac";
        GUIFactory factory ;
        if(os.contains("mac")) {
            factory = new MacFactory();
        }
        else if(os.contains("win")) {
            factory = new WindowsFactory();
        }
        else {
            throw new UnsupportedOperationException("Unsupported operating system: " + os);
        }

        Application app = new Application(factory);

        app.renderGUI();
    }
}
