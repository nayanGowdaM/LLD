package DesignPatterns.Creational.Singleton;

public class Singleton {

    private static Singleton inst;

    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if( inst == null){
            inst = new Singleton();
        }
        return inst;
    }
}
