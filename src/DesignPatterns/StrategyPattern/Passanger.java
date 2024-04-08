package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DriveStratergy.DriveStratergy;
import DesignPatterns.StrategyPattern.DriveStratergy.NormalDrive;

class Passanger extends  Vehicle{

    Passanger() {
        super(new NormalDrive());
    }
}

