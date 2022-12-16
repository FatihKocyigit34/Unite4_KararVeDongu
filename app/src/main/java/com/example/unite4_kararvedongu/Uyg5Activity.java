package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    EditText TxtNot1;
    EditText TxtNot2;
    EditText TxtNot3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        TxtNot1 = findViewById(R.id.editTxtNot1);
        TxtNot2 = findViewById(R.id.editTxtNot2);
        TxtNot3 = findViewById(R.id.editTxtNot3);
    }

    public void uyg5BtnGeridon(View view) {
        Intent i = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void uyg5BtnCalistir(View view) {
        int not1 = Integer.parseInt(TxtNot1.getText().toString());
        int not2 = Integer.parseInt(TxtNot2.getText().toString());
        int not3 = Integer.parseInt(TxtNot3.getText().toString());

        float ort = (not1 + not2 + not3) / 3;
        if (not1 <= 100 && not2 <= 100 && not3 <= 100) {
            if (ort >= 0 && ort < 25) {
                Toast.makeText(this, "0 ile kaldınız.", Toast.LENGTH_LONG).show();
            } else if (ort >= 25 && ort < 50) {
                Toast.makeText(this, "1 ile kaldınız.", Toast.LENGTH_LONG).show();
            } else if (ort >= 50 && ort < 60) {
                Toast.makeText(this, "2 ile geçtiniz.", Toast.LENGTH_LONG).show();
            } else if (ort >= 60 && ort < 70) {
                Toast.makeText(this, "3 ile geçtiniz.", Toast.LENGTH_LONG).show();
            } else if (ort >= 70 && ort < 85) {
                Toast.makeText(this, "4 ile geçtiniz.", Toast.LENGTH_LONG).show();
            } else if (ort >= 85 && ort < 100) {
                Toast.makeText(this, "5 ile geçtiniz.", Toast.LENGTH_LONG).show();
            }
        }
            else {
                Toast.makeText(this, "Girilen Not Bilgileri Yanlış.", Toast.LENGTH_LONG).show();
            }

    }
}
