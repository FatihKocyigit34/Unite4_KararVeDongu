package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru2Activity extends AppCompatActivity {

    EditText GoldSoru2SayiGiriniz;
    EditText GoldSoru2MultiText1;
    EditText GoldSoru2MultiText2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru2_activity);
        GoldSoru2MultiText1 = findViewById(R.id.editGolSoru2Multi1);
        GoldSoru2MultiText2 = findViewById(R.id.editGolSoru2Multi2);
        GoldSoru2SayiGiriniz = findViewById(R.id.editGolSoru2Sayi);
    }
    public void GoldSoru2Calistir (View view)
    {
        int sayi = Integer.parseInt(GoldSoru2SayiGiriniz.getText().toString());

        int sayac = 0;
        int sonucteksayi = 0;
        int sonucciftsayi = 0;

       while (sayac <= sayi)
       {
           if (sayac%2==1)
           {
               sonucteksayi = sayac + sonucteksayi;
               GoldSoru2MultiText1.setText(GoldSoru2MultiText1.getText().toString() + sonucteksayi + "\n");
           } else
           {
               sonucciftsayi = sayac + sonucciftsayi;
               GoldSoru2MultiText2.setText(GoldSoru2MultiText2.getText().toString() + sonucciftsayi + "\n");
           }
           sayac++;
       }

    }
}
