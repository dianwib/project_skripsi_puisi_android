package com.example.projectskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PuisiBernardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puisi_bernard);
    }public void fungsiback(View view) {
        Intent a =new Intent(PuisiBernardActivity.this,KumpusActivity.class);
        startActivity(a);
    }
}
