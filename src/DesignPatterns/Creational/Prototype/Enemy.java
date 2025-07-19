package DesignPatterns.Creational.Prototype;

public class Enemy  implements  EnemyPrototype{

    private final String type;
    private int health;
    private final double speed;
    private final boolean armored;
    private final String weapon;

    public Enemy(String type, int health, double speed, boolean armored, String weapon) {
        this.type = type;
        this.health = health;
        this.speed = speed;
        this.armored = armored;
        this.weapon = weapon;
    }
    /**
     * @return Enemy object clone
     */
    @Override
    public Enemy clone() {
        // deep copy logic can be added here if needed
        return new Enemy(type, health, speed, armored, weapon);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printStats() {
        System.out.println("Enemy Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Speed: " + speed);
        System.out.println("Armored: " + armored);
        System.out.println("Weapon: " + weapon);
    }
}