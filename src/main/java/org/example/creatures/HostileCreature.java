package org.example.creatures;

public  abstract class HostileCreature extends Creature{
    protected int level;

    public HostileCreature(String name) {
        super(name);
    }

    public abstract boolean  run(int distance);

    public abstract boolean  jump(int height);

}


