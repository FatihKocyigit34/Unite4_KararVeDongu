package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
    }
    public void uyg1CalistirFonk (View view){
        try {
            EditText txtNot = findViewById(R.id.editTxtNot);
            int not = Integer.parseInt(txtNot.getText().toString());
            if (not > 100)
            {
                Toast.makeText(this,"100 den büyük not giremezsiniz", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Başarıyla Not Girdiniz", Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this,"100 den küçük bir sayısal değer giriniz.", Toast.LENGTH_LONG).show();

        }



    }
    public void  uyg1BtnGeridon (View view){
        Intent i = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(i);
    }
}
