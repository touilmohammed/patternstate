package com.cours.statepattern.td;

public class MainMusicPlayerBad {

    public static void main(String[] args) {
        MusicPlayerBad player = new MusicPlayerBad();

        System.out.println("Etat initial : " + player.getState());
        System.out.println();

        System.out.println("Action: Play");
        System.out.println(player.clickPlay());
        System.out.println("Etat courant : " + player.getState());
        System.out.println();

        System.out.println("Action: Pause");
        System.out.println(player.clickPause());
        System.out.println("Etat courant : " + player.getState());
        System.out.println();

        System.out.println("Action: Play");
        System.out.println(player.clickPlay());
        System.out.println("Etat courant : " + player.getState());
        System.out.println();

        System.out.println("Action: Stop");
        System.out.println(player.clickStop());
        System.out.println("Etat courant : " + player.getState());
        System.out.println();

        System.out.println("Action: Pause");
        System.out.println(player.clickPause());
        System.out.println("Etat courant : " + player.getState());
        System.out.println();
    }
}