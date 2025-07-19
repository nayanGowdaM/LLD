package DesignPatterns.Creational.Prototype;

public class Game {
    public static void main(String[] args) {
        EnemyRegistry enemyRegistry = new EnemyRegistry();

        // Create a new enemy prototype
        Enemy goblin = new Enemy("Goblin", 100, 10, true, "Laser Gun");
        Enemy orc = new Enemy("Orc", 150, 20, false, "Axe");

        // Register the enemies
        enemyRegistry.registerEnemy("Goblin", goblin);
        enemyRegistry.registerEnemy("Orc", orc);

        // Clone the enemies
        Enemy clonedGoblin = enemyRegistry.getEnemy("Goblin");
        Enemy clonedOrc = enemyRegistry.getEnemy("Orc");
        Enemy clonedOrc2 = enemyRegistry.getEnemy("Orc");

        // Display the cloned enemies
        System.out.println("Cloned Goblin: " + clonedGoblin);
        clonedGoblin.printStats();
        System.out.println("Cloned Orc: " + clonedOrc);
        clonedOrc.printStats();
        System.out.println("Cloned Orc 2: " + clonedOrc2);
        clonedOrc2.printStats();

        // Modify the cloned goblin's health
        clonedGoblin.setHealth(80);
        System.out.println("After modifying cloned Goblin's health:");
        clonedGoblin.printStats();
    }
}
