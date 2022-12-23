package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    EditText txtFor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        txtFor = findViewById(R.id.txtForSayi2);
    }
    public void  uyg8BtnGeridon (View view){
        Intent i = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(i);
    }
    public void uyg8BtnCalistir (View view)
    {
        int dongusayisi = Integer.parseInt(txtFor.getText().toString());
        for(int i=1; i <= dongusayisi; i=i+3)
        {
            System.out.println(i);
        }
    }
}
