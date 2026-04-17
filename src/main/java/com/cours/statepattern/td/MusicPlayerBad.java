package com.cours.statepattern.td;

public class MusicPlayerBad {

    private String state;

    public MusicPlayerBad() {
        this.state = "STOPPED";
    }

    public String clickPlay() {
        if ("STOPPED".equals(state)) {
            state = "PLAYING";
            return "Starting music...";
        } else if ("PAUSED".equals(state)) {
            state = "PLAYING";
            return "Resuming music...";
        } else if ("PLAYING".equals(state)) {
            return "Already playing";
        }
        return "Unknown state";
    }

    public String clickPause() {
        if ("PLAYING".equals(state)) {
            state = "PAUSED";
            return "Pausing music...";
        } else if ("STOPPED".equals(state)) {
            return "Cannot pause, music is stopped";
        } else if ("PAUSED".equals(state)) {
            return "Already paused";
        }
        return "Unknown state";
    }

    public String clickStop() {
        if ("PLAYING".equals(state) || "PAUSED".equals(state)) {
            state = "STOPPED";
            return "Stopping music...";
        } else if ("STOPPED".equals(state)) {
            return "Already stopped";
        }
        return "Unknown state";
    }

    public String getState() {
        return state;
    }
}