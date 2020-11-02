package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        if(mediaPlayer == null){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.s);
        mediaPlayer.start();
        }else {
            mediaPlayer.start();
        }

    }
    public void pause(View view){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stop(View view){
        mediaPlayer.release();
        mediaPlayer = null;
    }

}
