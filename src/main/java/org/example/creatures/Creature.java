package org.example.creatures;

public abstract class Creature {
 protected String name;


    public Creature(String name) {
        this.name = name;
    }

    public abstract boolean run(int distance);
    public abstract boolean jump(int height);
}

