package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class secondactivity extends AppCompatActivity implements View.OnClickListener {
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        show=(Button) findViewById(R.id.VOLVER);
        show.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int seleccionar = v.getId();

            if (seleccionar == R.id.VOLVER) {
                Intent info = new Intent(this, firstactivity.class);
                startActivity(info);
            }


    }
}