package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    EditText txtFor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        txtFor = findViewById(R.id.txtForSayi);

    }
    public void  uyg7BtnGeridon (View view){
        Intent i = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(i);
    }
    public void uyg7BtnCalistir (View view)
    {

        int dongusayisi = Integer.parseInt(txtFor.getText().toString());
        for(int i=1; i <= dongusayisi; i++)
        {
            System.out.println(i);
        }
    }
}
