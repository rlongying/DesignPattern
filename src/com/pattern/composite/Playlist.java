package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent {
    private String playListName;
    private List<IComponent> playlist;

    public Playlist(String playListName) {
        this.playListName = playListName;
        this.playlist = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Playing list - " + playListName);
        for (IComponent c : playlist) {
            c.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent c : playlist) {
            c.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playListName;
    }

    public void add(IComponent component) {
        playlist.add(component);
    }

    public void remove(IComponent component) {
        playlist.remove(component);
    }

    @Override
    public String toString() {
        return "\n  List{ " + playListName + '\'' +
                ", songs" + playlist.toString() +
                '}';
    }
}
