package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DriveStratergy.DriveStratergy;
import DesignPatterns.StrategyPattern.DriveStratergy.SpecialDrive;

class Sports extends Vehicle{

    Sports() {

        super(new SpecialDrive());
    }
}
