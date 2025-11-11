package com.example.a1150070050_nguyenngoctuvy_th_lab5;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAnimation).setOnClickListener(v ->
                startActivity(new Intent(this, AnimationActivity.class)));

        findViewById(R.id.btnQuickCall).setOnClickListener(v ->
                startActivity(new Intent(this, QuickCallActivity.class)));
    }
}
