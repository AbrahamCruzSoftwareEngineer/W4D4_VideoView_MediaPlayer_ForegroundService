package com.evolutiondso.www.videoview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MediaPlayer extends AppCompatActivity {
    private android.media.MediaPlayer mediaPlayer;
    public TextView songName, duration;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the layout of the Activity
        setContentView(R.layout.activity_media_player);


        //initialize views
        initializeViews();
    }

    public void initializeViews(){
        songName = (TextView) findViewById(R.id.songName);
        mediaPlayer = android.media.MediaPlayer.create(this, R.raw.daft);
        duration = (TextView) findViewById(R.id.songDuration);
        seekbar = (SeekBar) findViewById(R.id.seekBar);
        songName.setText("DaftPunk.mp3");
        seekbar.setClickable(false);
    }

    // play mp3 song
    public void play(View view) {
        mediaPlayer.start();
    }


    // pause mp3 song
    public void pause(View view) {
        mediaPlayer.pause();
    }

    public void GotoVideo(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
