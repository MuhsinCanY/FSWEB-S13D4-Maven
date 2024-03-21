package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        setHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage < 0 ? 0 : Math.min(healthPercentage, 100);
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        if (healthPercentage - damage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        setHealthPercentage(healthPercentage - damage);
    }

    public void restoreHealth(int healthPotion) {
        setHealthPercentage(healthPercentage + healthPotion);
    }

}
