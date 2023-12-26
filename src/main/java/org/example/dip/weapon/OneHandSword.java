package org.example.dip.weapon;

public class OneHandSword {
    final String NAME;
    final int DAMAGE;

    OneHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    public int attack() {
        return DAMAGE;
    }
}


class TwoHandSword  {
}

class BattleAxe  {
}

class WarHammer  {
}
