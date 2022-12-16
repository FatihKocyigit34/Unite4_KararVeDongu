package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

    }
    public void  uyg3BtnGeridon (View view){
        Intent i = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void  uyg3BtnCalistir (View view)
    {

    }
}
