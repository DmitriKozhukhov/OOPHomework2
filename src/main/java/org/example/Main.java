package org.example;

import org.example.creatures.Cat;
import org.example.creatures.Creature;
import org.example.creatures.Robot;
import org.example.obstacles.Obstacle;
import org.example.obstacles.Track;
import org.example.obstacles.Wall;
import org.example.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Вася", 500, 200);
        Human human2 = new Human("Петя", 1000, 150);
        Cat cat1 = new Cat("Барсик", 600, 400);
        Cat cat2 = new Cat("Мурзик", 1500, 350);
        Robot robot1 = new Robot("T-800", 3000, 500);
        Robot robot2 = new Robot("T-1000", 10000, 1000);
        Track track1 = new Track(300);
        Track track2 = new Track(800);
        Track track3 = new Track(2000);
        Wall wall1 = new Wall(200);
        Wall wall2 = new Wall(400);
        Wall wall3 = new Wall(800);

        List<Creature> participants = new ArrayList<>();
        participants.add(human1);
        participants.add(human2);
        participants.add(cat1);
        participants.add(cat2);
        participants.add(robot1);
        participants.add(robot2);

        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(track1);
        obstacles.add(track2);
        obstacles.add(track3);
        obstacles.add(wall1);
        obstacles.add(wall2);
        obstacles.add(wall3);

        for (Obstacle obstacle : obstacles) {
            for (Creature creature : participants) {
                if (obstacle.getClass().equals(Track.class)) {
                    if (creature.run(((Track) obstacle).getDistance())) {
                        System.out.println("Участник пробежал");
                    } else {
                        break;
                    }

                }
                if (obstacle.getClass().equals(Wall.class)) {
                    if (creature.jump(((Wall) obstacle).getHeight())) {
                        System.out.println("Участник перепрыгнул стену");
                    } else {
                        break;
                    }

                }
            }


        }
    }
}