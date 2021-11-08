package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
public class firstactivity extends AppCompatActivity implements View.OnClickListener {
    Button suma, resta, multiplicacion, division, b1,b2,b3,b4,b5,b6,b7,b8,b9,clearr, bpunto,binfo, bresultado,b0;
    TextView showtex;
    private boolean decimal, sumar, restar, multiplicar, dividir  = false;
    Double[] num = new  Double[20];
    Double resultado;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suma=(Button) findViewById(R.id.SUM);
        suma.setOnClickListener(this);
        resta=(Button) findViewById(R.id.RES);
        resta.setOnClickListener(this);
        multiplicacion=(Button) findViewById(R.id.MUL);
        multiplicacion.setOnClickListener(this);
        division=(Button) findViewById(R.id.DIV);
        division.setOnClickListener(this);
        b1=(Button) findViewById(R.id.BTN1);
        b1.setOnClickListener( this);
        b2=(Button) findViewById(R.id.BTN2);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.BTN3);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.BTN4);
        b4.setOnClickListener(this);
        b5=(Button) findViewById(R.id.BTN5);
        b5.setOnClickListener( this);
        b6=(Button) findViewById(R.id.BTN6);
        b6.setOnClickListener(this);
        b7=(Button) findViewById(R.id.BTN7);
        b7.setOnClickListener( this);
        b8=(Button) findViewById(R.id.BTN8);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.BTN9);
        b9.setOnClickListener(this);
        clearr=(Button) findViewById(R.id.LIMPIAR);
        clearr.setOnClickListener( this);
        bpunto=(Button) findViewById(R.id.PUNTO);
        bpunto.setOnClickListener(this);
        binfo=(Button) findViewById(R.id.INFO);
        binfo.setOnClickListener(this);
        bresultado=(Button) findViewById(R.id.RESUL);
        bresultado.setOnClickListener(this);
        b0=(Button) findViewById(R.id.BTN0);
        b0.setOnClickListener(this);







    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        showtex=(TextView) findViewById(R.id.textver);
        int seleccionar = v.getId();
        String conca = showtex.getText().toString();
        try{
            switch (seleccionar){
                case R.id.BTN1:
                    showtex.setText(conca +"1");
                    break;
                case R.id.BTN2:
                    showtex.setText(conca +"2");
                    break;
                case R.id.BTN3:
                    showtex.setText(conca +"3");
                    break;
                case R.id.BTN4:
                    showtex.setText(conca +"4");
                    break;
                case R.id.BTN5:
                    showtex.setText(conca +"5");
                    break;
                case R.id.BTN6:
                    showtex.setText(conca +"6");
                    break;
                case R.id.BTN7:
                    showtex.setText(conca +"7");
                    break;
                case R.id.BTN8:
                    showtex.setText(conca +"8");
                    break;
                case R.id.BTN9:
                    showtex.setText(conca +"9");
                    break;
                case R.id.BTN0:
                    showtex.setText(conca +"0");
                    break;

                case R.id.PUNTO:
                    if(!decimal){
                        showtex.setText(conca +".");
                        decimal=true;
                    }else {return;}

                    break;
                case R.id.MUL:
                    showtex.setText("");
                    multiplicar=true;
                    num[0]=Double.parseDouble(conca);
                    decimal= false;
                    break;
                case R.id.RES:
                    showtex.setText("");
                    restar=true;
                    num[0]=Double.parseDouble(conca);
                    decimal= false;
                    break;
                case R.id.SUM:
                    showtex.setText("");
                    sumar=true;
                    num[0]=Double.parseDouble(conca);
                    decimal= false;
                    break;
                case R.id.DIV:
                    showtex.setText("");
                    dividir=true;
                    num[0]=Double.parseDouble(conca);
                    decimal= false;
                    break;
                case R.id.LIMPIAR:
                    showtex.setText("");
                    decimal=false;
                    break;
                case R.id.RESUL:

                    num [1]=Double.parseDouble(conca);
                    if(sumar){
                        resultado=num[0]+num[1];
                        showtex.setText(String.valueOf(resultado));
                    }else if (restar){
                        resultado=num[0]-num[1];
                        showtex.setText(String.valueOf(resultado));
                    }else if (dividir){
                        resultado=num[0]/num[1];
                        showtex.setText(String.valueOf(resultado));
                    }else if (multiplicar){
                        resultado=num[0]*num[1];
                        showtex.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    sumar = false;
                    restar  = false;
                    multiplicar = false;
                    dividir = false;
                    break;
                case R.id.INFO:
                    Intent info = new Intent(this, com.example.calculadora.secondactivity.class);
                    startActivity(info);
                    break;



            }


        }catch (Exception e){
            showtex.setText("Error");
        }

    }
}