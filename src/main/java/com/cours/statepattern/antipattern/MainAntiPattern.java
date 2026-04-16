package com.cours.statepattern.antipattern;

public class MainAntiPattern {

    public static void main(String[] args) {
        PhoneBad phone = new PhoneBad();
        simulatePhoneClicks(phone);
    }

    private static void simulatePhoneClicks(PhoneBad phone) {
        System.out.println("Initial state: " + phone.getState());
        System.out.println(phone.clickPower());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickPower());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickHome());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickHome());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickHome());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickPower());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickPower());
        System.out.println("Current state: " + phone.getState());

        System.out.println(phone.clickHome());
        System.out.println("Current state: " + phone.getState());
    }
}