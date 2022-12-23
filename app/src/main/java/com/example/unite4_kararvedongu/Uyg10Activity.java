package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Uyg10Activity extends AppCompatActivity {
    EditText txtDeger;
    TextView txtSonuc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        txtDeger = findViewById(R.id.txtNumberUyg10);
        txtSonuc = findViewById(R.id.textView2);
    }
    public void  uyg10BtnGeridon (View view){
        Intent i = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void  uyg10BtnCalistir (View view)
    {
        int faktoriyel = Integer.parseInt(txtDeger.getText().toString());
        int sayac = 1;
        long sonuc = 1;
        while (sayac <= faktoriyel)
        {
           sonuc = sonuc * sayac;
           sayac++;
        }
        txtSonuc.setText("Sonuç: " + sonuc);
    }
}
