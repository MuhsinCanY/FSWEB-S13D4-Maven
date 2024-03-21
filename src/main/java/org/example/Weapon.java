package org.example;

public enum Weapon {
    SWORD(10,5),
    MEDIUM(10,5),
    HIGH(10,5);

    private int damage;
    private double attactSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attactSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attactSpeed;
    }

    /*  public int getDamage() {
        return switch (this) {
            case SWORD -> 10;
            case MEDIUM -> 12;
            case HIGH -> 8;
        };
    }

    public double getAttackSpeed() {
        return switch (this) {
            case SWORD -> 2;
            case MEDIUM -> 1;
            case HIGH -> 3;
        };
    }*/
}
