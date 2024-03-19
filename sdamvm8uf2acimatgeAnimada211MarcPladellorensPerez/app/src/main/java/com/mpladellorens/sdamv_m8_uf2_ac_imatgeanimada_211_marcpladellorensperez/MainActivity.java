package com.mpladellorens.sdamv_m8_uf2_ac_imatgeanimada_211_marcpladellorensperez;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imatge = (ImageView) findViewById(R.id.imageView);
        Animation venir = AnimationUtils.loadAnimation(this, R.anim.anim);

        imatge.startAnimation(venir);
    }
}