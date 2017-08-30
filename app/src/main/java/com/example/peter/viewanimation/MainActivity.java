package com.example.peter.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image_view);

        setListener();

    }

    private void setListener() {
        findViewById(R.id.alpha_btn).setOnClickListener(this);
        findViewById(R.id.scale_btn).setOnClickListener(this);
        findViewById(R.id.translate_btn).setOnClickListener(this);
        findViewById(R.id.rotate_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.alpha_btn:
                animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
                break;
            case R.id.scale_btn:
                animation = AnimationUtils.loadAnimation(this,R.anim.scale);
                break;
            case R.id.translate_btn:
                animation = AnimationUtils.loadAnimation(this,R.anim.translate);
                break;
            case R.id.rotate_btn:
                animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
                break;
        }

        imageView.startAnimation(animation);
    }
}
