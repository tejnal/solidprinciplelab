package com.solid.principles.liskovsubstitutionprinciple.good;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LiskovTestProgram {

    @Test
    public void testLiskovPrinciple(){

        // Created list of video players
        List<VideoMediaPlayer> allPlayers = new ArrayList< >();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        // Play video in all players
        playVideoInAllMediaPlayers(allPlayers);

        // Well - all works as of now...... :-)
        System.out.println("---------------------------");

        // Now adding new Winamp player. If you uncomment below line,
        // it would give compile time error as can't add audio player in list of video players.
        // allPlayers.add(new WinampMediaPlayer());
    }

    public static void playVideoInAllMediaPlayers(List < VideoMediaPlayer > allPlayers) {

        for (VideoMediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }
}
