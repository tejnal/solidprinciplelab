package com.solid.principles.liskovsubstitutionprinciple.good;

public class VideoMediaPlayer extends AudioMediaPlayer {

  // Play video implementation
  public void playVideo() {
    System.out.println("Playing video...");
  }
}
