package org.example.creatures;

public class Robot extends HostileCreature {

    private int distance;
    private int height;
    public Robot(String name, int distance, int height) {
        super(name);
        this.distance = distance;
        this.height = height;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Робот " + name +  " с дальностью бега " + this.distance + " начал бежать");
        if (this.distance >= distance){
            System.out.println("Робот " + name + " пробежал расстояние " + distance);
            return true;
        }
        else
        {
            System.out.println("Робот " + name + " не смог пробежать расстояние " + distance);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Робот " + name + " с высотой прыжка " + this.height + " хочет прыгнуть");
        if (this.height >= height){
            System.out.println("Робот " + name + " перепрыгнул стену высотой " + height);
            return true;
        }
        else
        {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену высотой " + height);
            return false;
        }

    }
}
