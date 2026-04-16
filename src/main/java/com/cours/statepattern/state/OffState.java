package com.cours.statepattern.state;

import com.cours.statepattern.Phone;

public class OffState implements State {

    private final Phone phone;

    public OffState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        return "Phone is off. Home button has no effect";
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}