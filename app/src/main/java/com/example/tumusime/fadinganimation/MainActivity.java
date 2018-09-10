package com.example.tumusime.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView imageView = (ImageView) findViewById(R.id.image);
        ImageView imageView1 = (ImageView) findViewById(R.id.image1);

        imageView.animate().alpha(0f).setDuration(3000);
        imageView1.animate().alpha(1f).setDuration(3000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
