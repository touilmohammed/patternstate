package com.cours.statepattern.antipattern;

public class PhoneBad {

    private String state;

    public PhoneBad() {
        this.state = "OFF";
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String clickPower() {
        switch (state) {
            case "OFF" -> {
                state = "LOCKED";
                return "Turning screen on, device still locked";
            }
            case "LOCKED" -> {
                state = "OFF";
                return "Locking phone and turning off the screen";
            }
            case "READY" -> {
                state = "LOCKED";
                return "Locking phone and going to locked screen";
            }
            case null, default -> {
                return "Unknown state";
            }
        }
    }

    public String clickHome() {
        switch (state) {
            case "OFF" -> {
                return "Phone is off. Home button has no effect";
            }
            case "LOCKED" -> {
                state = "READY";
                return "Unlocking the phone to home";
            }
            case "READY" -> {
                return "Going to home-screen";
            }
            case null, default -> {
                return "Unknown state";
            }
        }
    }
}