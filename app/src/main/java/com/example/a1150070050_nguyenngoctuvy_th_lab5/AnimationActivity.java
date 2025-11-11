package com.example.a1150070050_nguyenngoctuvy_th_lab5;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivAnimal;
    private final Random random = new Random();

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        initViews();
    }

    private void initViews() {
        ivAnimal = findViewById(R.id.iv_animal);
        findViewById(R.id.bt_alpha).setOnClickListener(this);
        findViewById(R.id.bt_rotate).setOnClickListener(this);
        findViewById(R.id.bt_scale).setOnClickListener(this);
        findViewById(R.id.bt_trans).setOnClickListener(this);
        findViewById(R.id.bt_random).setOnClickListener(this); // Bài tập 1
    }

    private void startAnim(int animRes) {
        Animation a = AnimationUtils.loadAnimation(this, animRes);
        ivAnimal.startAnimation(a);
    }

    @Override public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_alpha) {
            startAnim(R.anim.alpha);
        } else if (id == R.id.bt_rotate) {
            startAnim(R.anim.rotate);
        } else if (id == R.id.bt_scale) {
            startAnim(R.anim.scale);
        } else if (id == R.id.bt_trans) {
            startAnim(R.anim.translate);
        } else if (id == R.id.bt_random) {
            // Bài tập 1: random 1 hiệu ứng
            int[] anims = new int[]{R.anim.alpha, R.anim.rotate, R.anim.scale, R.anim.translate};
            startAnim(anims[random.nextInt(anims.length)]);
        }
    }
}
