package DesignPatterns.Creational.Singleton;

public class Singleton {

    private static Singleton inst;

    private Singleton(){

    }
    public static  Singleton getInstance(){
        if( inst == null){
            inst = new Singleton();
        }
        return inst;
    }
}
