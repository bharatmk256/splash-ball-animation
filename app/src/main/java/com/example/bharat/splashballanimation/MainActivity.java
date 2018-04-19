package com.example.bharat.splashballanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button sub;
    ImageView ballon;
    Animation frombottom,fromtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub = (Button) findViewById(R.id.sub);
        ballon = (ImageView) findViewById(R.id.baloon);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombutton);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        sub.setAnimation(frombottom);
        ballon.setAnimation(fromtop);
    }
}
