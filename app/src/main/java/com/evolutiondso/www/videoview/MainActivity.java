package com.evolutiondso.www.videoview;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Button1);
        getWindow().setFormat(PixelFormat.UNKNOWN);

        final VideoView videoView = (VideoView) findViewById(R.id.VideoView1);

        String uriPath2 = "android.resource://com.evolutiondso.www.videoview/"+R.raw.movie;
        final Uri Uri2 = Uri.parse(uriPath2);
        videoView.setVideoURI(Uri2);
        videoView.requestFocus();
        videoView.start();

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
               VideoView videoView1 = (VideoView) findViewById(R.id.VideoView1);
                String uriPath = "android.resource://com.evolutiondso.www.videoview/"+R.raw.movie;
                Uri uri2 = Uri.parse(uriPath);
                videoView.setVideoURI(Uri2);
                videoView.requestFocus();
                videoView.start();
            }
        });

    }

    public void GoMediaPlayer(View view) {
        Intent intent = new Intent(this, MediaPlayer.class);
        startActivity(intent);
    }
}
