package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru1Activity extends AppCompatActivity {
    EditText GoldSoru1SayiGiriniz;
    EditText GoldSoru1MultiText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru1_activity);
        GoldSoru1MultiText = findViewById(R.id.editGolSoru1Multi);
        GoldSoru1SayiGiriniz = findViewById(R.id.editGolSoru1Sayi);
    }

    public void GoldSoru1Calistir (View view)
    {
        int CarpilanSayi = Integer.parseInt(GoldSoru1SayiGiriniz.getText().toString());
        int i;
        GoldSoru1MultiText.setText("");
        for (i = 1; i <= 10; i++)
        {
            int sonuc = CarpilanSayi * i;
            GoldSoru1MultiText.setText(GoldSoru1MultiText.getText().toString()  + CarpilanSayi + " X " + i  + " = " + sonuc + "\n");
        }
    }
}
