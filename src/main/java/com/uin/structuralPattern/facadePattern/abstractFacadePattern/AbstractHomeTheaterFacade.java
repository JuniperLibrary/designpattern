package com.uin.structuralPattern.facadePattern.abstractFacadePattern;

import com.uin.structuralPattern.facadePattern.subSystem.DVDPlayer;
import com.uin.structuralPattern.facadePattern.subSystem.Projector;
import com.uin.structuralPattern.facadePattern.subSystem.SoundSystem;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象外观类
 */
@Slf4j
public abstract class AbstractHomeTheaterFacade {

  protected DVDPlayer dvdPlayer;
  protected Projector projector;
  protected SoundSystem soundSystem;

  public AbstractHomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
    this.dvdPlayer = dvd;
    this.projector = projector;
    this.soundSystem = sound;
  }

  public abstract void watchMovie(String movie);

  public abstract void endMovie();
}
