package org.example.dip;

import org.example.dip.weapon.OneHandSword;

public class Character  {
    final String NAME;
    int health;

    OneHandSword oneHandSword;

    public Character(String NAME, int health) {
        this.NAME = NAME;
        this.health = health;
    }
}
