package com.solid.principles.liskovsubstitutionprinciple.bad;

import com.solid.principles.liskovsubstitutionprinciple.exception.VideoUnsupportedException;

public class WinampMediaPlayer extends MediaPlayer {

  // Play video is not supported in Winamp player
  public void playVideo() {
    throw new VideoUnsupportedException();
  }
}
