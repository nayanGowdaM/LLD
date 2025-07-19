package DesignPatterns.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private final Map<String, Enemy> enemies = new HashMap<>();

    public  void registerEnemy(String name, Enemy enemy) {
        enemies.put(name, enemy);
    }

    public Enemy getEnemy(String name) {
        Enemy enemy = enemies.get(name);
        if(enemy != null) {
            return enemy.clone();
        }
        throw new IllegalArgumentException("Enemy not found: " + name);
    }
}
