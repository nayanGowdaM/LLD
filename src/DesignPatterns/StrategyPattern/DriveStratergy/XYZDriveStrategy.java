package DesignPatterns.StrategyPattern.DriveStratergy;

public class XYZDriveStrategy implements  DriveStratergy{
    @Override
    public void drive() {
        System.out.println("Describe your drive strategy");
    }
}
