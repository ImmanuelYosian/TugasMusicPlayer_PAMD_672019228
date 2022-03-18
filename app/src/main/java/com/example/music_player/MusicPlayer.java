package com.example.music_player;

import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.view.View;

public class MusicPlayer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }
    public static int currentIndex = -1;

}
