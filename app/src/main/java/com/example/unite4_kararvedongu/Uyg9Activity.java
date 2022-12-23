package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtSayilar,txtDonguSayisi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        txtDonguSayisi = findViewById(R.id.editTextNumber);
        txtSayilar = findViewById(R.id.editTextTextMultiLine);
    }
    public void  uyg9BtnGeridon (View view){
        Intent i = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(i);
    }
    public void uyg9BtnCiftSayilar (View view)
    {
        txtSayilar.setText("");
        int dongusayisi = Integer.parseInt(txtDonguSayisi.getText().toString());
        for (int i=0; i<=dongusayisi; i++)
        {
            if (i%2==0)
            {
                txtSayilar.setText(txtSayilar.getText().toString() + "-" + i);
            }
        }
    }

    public void uyg9BtnTekSayilar (View view)
    {
        txtSayilar.setText("");
        int dongusayisi = Integer.parseInt(txtDonguSayisi.getText().toString());
        for (int i=0; i<=dongusayisi; i++)
        {
            if (i%2==1)
            {
                txtSayilar.setText(txtSayilar.getText().toString() + "-" + i);
            }
        }
    }

    public void uyg9BtnTumSayilar (View view)
    {
        txtSayilar.setText("");
        int dongusayisi = Integer.parseInt(txtDonguSayisi.getText().toString());
        for (int i=0; i<=dongusayisi; i++)
        {
            txtSayilar.setText(txtSayilar.getText().toString() + "-" + i);
        }
    }

}
