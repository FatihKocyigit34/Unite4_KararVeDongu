package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch KonumServisleri;
    Switch KonumBilgileriniAl;
    Switch KonumBilgileriniGoster;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);

        KonumServisleri = findViewById(R.id.switchKonumServisleri);
        KonumBilgileriniAl = findViewById(R.id.switchKonumBilgileriniAl);
        KonumBilgileriniGoster = findViewById(R.id.switchKonumBilgileriniGoster);

        if (KonumServisleri.isChecked())
        {
            KonumBilgileriniAl.setVisibility(View.VISIBLE);
            KonumBilgileriniGoster.setVisibility(View.VISIBLE);
        }
        else
        {
            KonumBilgileriniAl.setVisibility(View.GONE);
            KonumBilgileriniGoster.setVisibility(View.GONE);
        }

    }
    public void  uyg4BtnGeridon (View view){
        Intent i = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        KonumServisleri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (KonumServisleri.isChecked())
                {
                    KonumBilgileriniAl.setVisibility(View.VISIBLE);
                    KonumBilgileriniGoster.setVisibility(View.VISIBLE);
                }
                else
                {
                    KonumBilgileriniAl.setVisibility(View.GONE);
                    KonumBilgileriniGoster.setVisibility(View.GONE);
                }
            }
        });
    }

    public void uyg4BtnCalistir (View view)
    {
        if (!KonumServisleri.isChecked())
        {
            Toast.makeText(this,"Konum Servisleri Kapal??",Toast.LENGTH_LONG).show();
        }
        else
        {
            if (KonumBilgileriniAl.isChecked()==true && KonumBilgileriniGoster.isChecked()==true)
            {
                Toast.makeText(this,"Konum Bilgilerini Al ve Konum Bilgilerini G??ster A????k",Toast.LENGTH_LONG).show();
            }
            if (KonumBilgileriniAl.isChecked()==true && KonumBilgileriniGoster.isChecked()==false)
            {
                Toast.makeText(this,"Konum Bilgilerini Al A????k ve Konum Bilgilerini G??ster Kapal??",Toast.LENGTH_LONG).show();
            }
            if (KonumBilgileriniAl.isChecked()==false && KonumBilgileriniGoster.isChecked()==true)
            {
                Toast.makeText(this,"Konum Bilgilerini Al Kapal?? ve Konum Bilgilerini G??ster A????k",Toast.LENGTH_LONG).show();
            }
            if (KonumBilgileriniAl.isChecked()==false && KonumBilgileriniGoster.isChecked()==false)
            {
                Toast.makeText(this,"Konum Bilgilerini Al ve Konum Bilgilerini G??ster Kapal??",Toast.LENGTH_LONG).show();
            }
        }

    }
}
