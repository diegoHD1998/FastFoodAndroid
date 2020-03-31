package com.example.fastfood;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Sandwiches extends AppCompatActivity {


    private ArrayList<sandwich> arraySandwich;
    LinearLayout caja;
    Button botonI, botonC, botonB, botonCH, botonA;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
        botonI=findViewById(R.id.ItalianoID);
        botonC=findViewById(R.id.ChacareroID);
        botonB=findViewById(R.id.BarrosID);
        botonCH=findViewById(R.id.ChemilicoID);
        botonA=findViewById(R.id.ArrolladoID);
        caja= (LinearLayout) findViewById(R.id.caja);

        final ArrayList<sandwich> arraySandwich =new ArrayList<sandwich>();
        arraySandwich.add(new sandwich(R.string.s1, R.drawable.descarga, R.string.descripcionS1, R.string.precioS1, R.string.barraS1));
        arraySandwich.add(new sandwich(R.string.s2, R.drawable.chacarero, R.string.descripcionS2, R.string.precioS2, R.string.barraS2));
        arraySandwich.add(new sandwich(R.string.s3, R.drawable.barros, R.string.descripcionS3, R.string.precioS3, R.string.barraS3));
        arraySandwich.add(new sandwich(R.string.s4, R.drawable.chemilico, R.string.descripcionS4, R.string.precioS4, R.string.barraS4));
        arraySandwich.add(new sandwich(R.string.s5, R.drawable.arrollado, R.string.descripcionS5, R.string.precioS5, R.string.barraS5));

        arraySandwich.trimToSize();

        for (int i=0;i<arraySandwich.size();i++){
            final sandwich S = arraySandwich.get(i);




            final int final1= i;


            if (i==0){
                botonI.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent0 =new Intent(Sandwiches.this,Especificacion1.class);
                        intent0.putExtra("ID",final1);
                        intent0.putExtra("modelo",arraySandwich);
                        startActivity(intent0);
                    }
                });

            }

            if (i==1){
                botonC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 =new Intent(Sandwiches.this,Especificacion1.class);
                        intent1.putExtra("ID",final1);
                        intent1.putExtra("modelo",arraySandwich);
                        startActivity(intent1);
                    }
                });

            }

            if (i==2){
                botonB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sandwiches.this,Especificacion1.class);
                        intent.putExtra("ID",final1);
                        intent.putExtra("modelo",arraySandwich);
                        startActivity(intent);
                    }
                });
            }

            if (i==3){
                botonCH.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 =new Intent(Sandwiches.this,Especificacion1.class);
                        intent3.putExtra("ID",final1);
                        intent3.putExtra("modelo",arraySandwich);
                        startActivity(intent3);
                    }
                });

            }

            if (i==4){
                botonA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent4 =new Intent(Sandwiches.this,Especificacion1.class);
                        intent4.putExtra("ID",final1);
                        intent4.putExtra("modelo",arraySandwich);
                        startActivity(intent4);
                    }
                });

            }

        }

    }
}
