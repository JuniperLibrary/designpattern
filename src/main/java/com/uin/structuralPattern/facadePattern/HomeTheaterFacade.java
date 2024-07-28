package com.uin.structuralPattern.facadePattern;

import com.uin.structuralPattern.facadePattern.subSystem.DVDPlayer;
import com.uin.structuralPattern.facadePattern.subSystem.Projector;
import com.uin.structuralPattern.facadePattern.subSystem.SoundSystem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 外观类
 *
 * @author dingchuan
 */
@Slf4j
@RequiredArgsConstructor
public class HomeTheaterFacade {

  private final DVDPlayer dvdPlayer;
  private final Projector projector;
  private final SoundSystem soundSystem;

  public void watchMovie(String movie) {
    log.info("Get ready to watch a movie...");
    dvdPlayer.on();
    dvdPlayer.play(movie);
    projector.on();
    projector.wideScreenMode();
    soundSystem.on();
    soundSystem.setVolume(5);
    log.info("Movie is ready to watch!");
  }

  public void endMovie() {
    log.info("Shutting movie theater down...");
    dvdPlayer.off();
    projector.off();
    soundSystem.off();
  }
}
