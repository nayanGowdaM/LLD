package DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());
        if (s1 == s2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different instances.");
        }
    }
}
