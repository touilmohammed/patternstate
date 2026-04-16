package com.cours.statepattern.state;

import com.cours.statepattern.Phone;

public class LockedState implements State {

    private final Phone phone;

    public LockedState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}