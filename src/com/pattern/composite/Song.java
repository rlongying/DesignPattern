package com.pattern.composite;

public class Song implements IComponent {
    private String name;
    private String artist;
    private float speed;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
        speed = 1.0f;
    }

    @Override
    public void play() {
        System.out.println(toString());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "\n    Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", speed=" + speed +
                '}';
    }
}
