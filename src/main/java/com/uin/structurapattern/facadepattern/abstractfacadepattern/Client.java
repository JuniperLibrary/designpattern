package com.uin.structurapattern.facadepattern.abstractfacadepattern;

import com.uin.structurapattern.facadepattern.subsystem.DVDPlayer;
import com.uin.structurapattern.facadepattern.subsystem.Projector;
import com.uin.structurapattern.facadepattern.subsystem.SoundSystem;

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
