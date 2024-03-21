package org.example;

public enum Weapon {
    SWORD,
    MEDIUM,
    HIGH;

    public int getDamage() {
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
    }
}
