package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.DriveStratergy.DriveStratergy;

class Vehicle {
    DriveStratergy driveObj ;
    Vehicle(DriveStratergy drivestrategy){
        this.driveObj = drivestrategy;
    }
    public void drive(){
        driveObj.drive();
    }
}
