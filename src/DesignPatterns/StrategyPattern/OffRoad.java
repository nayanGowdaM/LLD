package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DriveStratergy.DriveStratergy;
import DesignPatterns.StrategyPattern.DriveStratergy.SpecialDrive;

class OffRoad extends Vehicle{
    OffRoad() {
        super(new SpecialDrive());
    }
}
