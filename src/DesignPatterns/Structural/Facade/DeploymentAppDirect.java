package DesignPatterns.Structural.Facade;

public class DeploymentAppDirect {
    public static void main(String[] args) {
        DeploymentFacade deploymentOrchestrator = new DeploymentFacade();
        deploymentOrchestrator.application("main", "prod-server-1");
    }
}
