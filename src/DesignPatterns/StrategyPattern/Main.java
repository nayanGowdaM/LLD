package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DriveStratergy.DriveStratergy;
import DesignPatterns.StrategyPattern.DriveStratergy.NormalDrive;
import DesignPatterns.StrategyPattern.DriveStratergy.SpecialDrive;

public class Main {
    public static void main(String[] args){
        Vehicle PassangerCar = new Passanger();
        PassangerCar.drive();

    }
}
