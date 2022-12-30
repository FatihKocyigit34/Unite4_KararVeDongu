package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  uyg1BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(i);
    }
    public void  uyg2BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }
    public void  uyg3BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(i);
    }
    public void  uyg4BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }
    public void  uyg5BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg5Activity.class);
        startActivity(i);
    }
    public void  uyg6BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg6Activity.class);
        startActivity(i);
    }
    public void  uyg7BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
        startActivity(i);
    }
    public void  uyg8BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg8Activity.class);
        startActivity(i);
    }
    public void  uyg9BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg9Activity.class);
        startActivity(i);
    }
    public void  uyg10BtnGoster (View view){
        Intent i = new Intent(MainActivity.this, Uyg10Activity.class);
        startActivity(i);
    }
    public void goldsoru1 (View view)
    {
        Intent i = new Intent(MainActivity.this, GoldSoru1Activity.class);
        startActivity(i);
    }
    public void goldsoru2 (View view)
    {
        Intent i = new Intent(MainActivity.this, GoldSoru2Activity.class);
        startActivity(i);
    }
    public void goldsoru3 (View view)
    {
        Intent i = new Intent(MainActivity.this, GoldSoru3Activity.class);
        startActivity(i);
    }
}