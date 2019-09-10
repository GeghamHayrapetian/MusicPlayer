package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
   private  MediaPlayer ambientMediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        ambientMediaPlayer=MediaPlayer.create(this,R.raw.jazz);
        ambientMediaPlayer.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ambientMediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {

        ambientMediaPlayer.release();
    }
}
