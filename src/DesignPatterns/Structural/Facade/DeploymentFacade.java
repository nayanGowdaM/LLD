package DesignPatterns.Structural.Facade;

public class DeploymentFacade {
    private  BuildSystem buildSystem = new BuildSystem();
    private VersionControlSystem vcs = new VersionControlSystem();
    private TestingFramework testingFramework = new TestingFramework();


    public  boolean application(String branch, String prodServer) {
        System.out.println("Orchestrating deployment for branch: " + branch + " to server: " + prodServer);

        vcs.pullLatestChanges();

        if(!buildSystem.compileProject()) {
            System.out.println("Build failed. Aborting deployment.");
            return false;
        }

        if(!testingFramework.runUnitTests()) {
            System.out.println("Unit tests failed. Aborting deployment.");
            return false;
        }

        if(!testingFramework.runIntegrationTests()) {
            System.out.println("Integration tests failed. Aborting deployment.");
            return false;
        }

        System.out.println("Deployment successful!");
        return true;
    }
}
