package org.example.obstacles;

public class Track extends Obstacle {
    public int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Track{" +
                "distance=" + distance +
                '}';
    }
}
