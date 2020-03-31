package com.example.fastfood;

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

    public void Boton1(View view) {
        Intent Boton1 = new Intent(this,Sandwiches.class);
        startActivity(Boton1);
    }

    public void Boton2(View view) {
        Intent Boton2 = new Intent(this,Nosotros.class);
        startActivity(Boton2);
    }
}
