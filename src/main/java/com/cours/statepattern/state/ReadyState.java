package com.cours.statepattern.state;

import com.cours.statepattern.Phone;

public class ReadyState implements State {

    private final Phone phone;

    public ReadyState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return "Locking phone and going to locked screen";
    }
}