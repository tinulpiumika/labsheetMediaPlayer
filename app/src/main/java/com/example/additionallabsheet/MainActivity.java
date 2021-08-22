package com.example.additionallabsheet;

//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import android.app.Service;
import android.content.Intent;
//import android.media.MediaPlayer;
import android.os.Bundle;
//import android.os.IBinder;
//import android.provider.Settings;
import android.view.View;
//import android.widget.Button;

//import java.util.EventListener;

public class MainActivity extends AppCompatActivity  {

    //Button btnStart = findViewById(R.id.play);
    //Button btnStop = findViewById(R.id.stopBtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        //player.setLooping(true);
        //player.start();
/*
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyServices.class));
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent (MainActivity.this, MyServices.class));
            }
        }); */
    }


    public void startClicked(View view) {

        startService(new Intent(MainActivity.this, MyServices.class));
    }

    public void stopClicked(View view) {

        stopService(new Intent (MainActivity.this, MyServices.class));
    }

    public void redirectHome(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);

    }
}


