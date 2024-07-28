package com.uin.structuralPattern.facadePattern.abstractFacadePattern;

import com.uin.structuralPattern.facadePattern.subSystem.DVDPlayer;
import com.uin.structuralPattern.facadePattern.subSystem.Projector;
import com.uin.structuralPattern.facadePattern.subSystem.SoundSystem;

public class Client {

  public static void main(String[] args) {
    DVDPlayer dvd = new DVDPlayer();
    Projector projector = new Projector();
    SoundSystem sound = new SoundSystem();

    AbstractHomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);
    homeTheater.watchMovie("Inception");
    homeTheater.endMovie();
  }
}
