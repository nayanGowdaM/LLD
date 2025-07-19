package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Application.Application;
import DesignPatterns.Creational.AbstractFactory.Factory.GUIFactory;
import DesignPatterns.Creational.AbstractFactory.Factory.LinuxFactory;
import DesignPatterns.Creational.AbstractFactory.Factory.MacFactory;
import DesignPatterns.Creational.AbstractFactory.Factory.WindowsFactory;

public class ApplicationLaunch {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory ;
        if(os.contains("mac")) {
            factory = new MacFactory();
        }
        else if(os.contains("win")) {
            factory = new WindowsFactory();
        }
        else if(os.contains("linux")) {
            factory = new LinuxFactory();
        }
        else {
            throw new UnsupportedOperationException("Unsupported operating system: " + os);
        }

        Application app = new Application(factory);

        app.renderGUI();
    }
}
