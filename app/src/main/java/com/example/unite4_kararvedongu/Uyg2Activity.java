package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);

    }
    public void  uyg2BtnGeridon (View view){
        Intent i = new Intent(Uyg2Activity.this, MainActivity.class);
        startActivity(i);
    }
    public  void  uyg2CalistirFonk(View view){
        try {
            EditText txtSayi1 = findViewById(R.id.editTxtSayi1);
            EditText txtSayi2 = findViewById(R.id.editTxtSayi2);
            int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
            int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
            if (sayi1 > sayi2) {
                Toast.makeText(this, "Sayı 1 Sayı 2 den Büyüktür", Toast.LENGTH_LONG).show();
            }
            if (sayi2 > sayi1) {
                Toast.makeText(this, "Sayı 2 Sayı 1 den Büyüktür", Toast.LENGTH_LONG).show();
            }
            if (sayi1 == sayi2) {
                Toast.makeText(this, "Sayı 1 ve Sayı 2 Eşittir", Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Sayısal bir değer giriniz.", Toast.LENGTH_LONG).show();
        }

    }
}
