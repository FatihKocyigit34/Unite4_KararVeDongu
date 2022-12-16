package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
    }
    public void  uyg5BtnGeridon (View view){
        Intent i = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void uyg5BtnCalistir (View view)
    {

    }
}
