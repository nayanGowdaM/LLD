package DesignPatterns.Structural.Adapter.Facade;

public class BuildSystem {
    public boolean compileProject() {
        System.out.println("Compiling the project...");
        // Simulate compilation logic
        return true; // Assume compilation is successful
    }

    public  String getArtifactPath() {
        System.out.println("Retrieving the artifact path...");
        // Simulate retrieving the artifact path
        return "/path/to/artifact.jar"; // Example path
    }

}
