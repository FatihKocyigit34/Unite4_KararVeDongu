package com.example.unite4_kararvedongu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    final String kullaniciadi = "fatihkocyigit34";
    final String sifre = "fatih34";

    EditText kullaniciadigiris;
    EditText SifreGiris;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        kullaniciadigiris = findViewById(R.id.editTxtKullaniciAdi);
        SifreGiris = findViewById(R.id.editTxtSifre);

    }

    public void  uyg3BtnGeridon (View view){
        Intent i = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void uyg3BtnCalistir (View view)
    {
        try {
            String sayi1 = kullaniciadigiris.getText().toString();
            String sayi2 = SifreGiris.getText().toString();

            if (sayi1.equals(kullaniciadi) && sayi2.equals(sifre))
            {
                Toast.makeText(this, "Giriş Başarılı",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "Kullanıcı Adı veya Şifreniz hatalı",Toast.LENGTH_LONG).show();
            }
        }

        catch (Exception e)
        {

        }

    }
}
