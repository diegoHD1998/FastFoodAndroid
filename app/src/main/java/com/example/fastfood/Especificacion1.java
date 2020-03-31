package com.example.fastfood;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Especificacion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especificacion1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final ArrayList<sandwich> arraySandwich = (ArrayList<sandwich>) getIntent().getSerializableExtra("modelo");
        final ImageView imagen1 =(ImageView) findViewById(R.id.imagenDetalle2);
        TextView texto1=(TextView) findViewById(R.id.detalle1);
        TextView texto3=(TextView) findViewById(R.id.detalle3);
        TextView texto4=(TextView) findViewById(R.id.detalle4);

        int a= (int) getIntent().getSerializableExtra("ID");
        arraySandwich.trimToSize();
        final sandwich S=arraySandwich.get(a);
        actionBar.setTitle(S.getmTitulo());
        texto1.setText(S.getmNombre());
        texto3.setText(S.getmDescri());
        texto4.setText(S.getmPrecio());
        imagen1.setImageResource(S.getmIdent());

    }


}
