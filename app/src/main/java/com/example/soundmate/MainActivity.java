package com.example.soundmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

     RippleBackground rippleBackground;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rippleBackground=findViewById(R.id.content);
        imageView=findViewById(R.id.centerImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rippleBackground.startRippleAnimation();
            }
        });

        rippleBackground.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rippleBackground.stopRippleAnimation();
            }
        });

    }

}