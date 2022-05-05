package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity {

    //Declaracion de variables
    Button btnSuma, btnResta, btnMultiplicar, btnDividir, btnBorrar, btnIgual, btnPunto, btnPorcentaje, btnClear;
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;

    private TextView txtResultado;
    private double n1=0;
    private double n2=0;
    String opera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        txtResultado = (TextView) findViewById(R.id.resultado);

        btnSuma = (Button) findViewById(R.id.suma);
        btnSuma.setOnClickListener((v) -> {
            opera = "+";
            n1 = Integer.parseInt(txtResultado.getText().toString());
            txtResultado.setText("");
        });

        btnResta = (Button) findViewById(R.id.resta);
        btnResta.setOnClickListener((v) -> {
            opera = "-";
            n1 = Integer.parseInt(txtResultado.getText().toString());
            txtResultado.setText("");
        });

        btnMultiplicar = (Button) findViewById(R.id.multiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "*";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnDividir = (Button) findViewById(R.id.dividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "/";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnPorcentaje = (Button) findViewById(R.id.Porcentaje);
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "%";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnPunto = (Button) findViewById(R.id.punto);
        btnPunto.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+".");
        });

        btnClear = (Button) findViewById(R.id.Clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("");
            }
        });

        btnBorrar = (Button) findViewById(R.id.Borrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("");
            }
        });
        btnCero = findViewById(R.id.cero);
        btnCero.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"0");
        });
        btnUno = findViewById(R.id.uno);
        btnUno.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"1");
        });
        btnDos = findViewById(R.id.dos);
        btnDos.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"2");
        });
        btnTres = findViewById(R.id.tres);
        btnTres.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"3");
        });
        btnCuatro = findViewById(R.id.cuatro);
        btnCuatro.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"4");
        });
        btnCinco = findViewById(R.id.cinco);
        btnCinco.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"5");
        });
        btnSeis = findViewById(R.id.seis);
        btnSeis.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"6");
        });
        btnSiete = findViewById(R.id.siete);
        btnSiete.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"7");
        });
        btnOcho = findViewById(R.id.ocho);
        btnOcho.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"8");
        });
        btnNueve = findViewById(R.id.nueve);
        btnNueve.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"9");
        });

        btnIgual = (Button) findViewById(R.id.igual);
        btnIgual.setOnClickListener((v) -> {
            n2 = Integer.parseInt(txtResultado.getText().toString());
            double op1;
            if(opera == "+"){
                op1 = Suma((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "-"){
                op1 = Resta((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "*"){
                op1 = Multiplicacion((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "/"){
                op1 = Division((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "%"){
                op1 = Porcentaje(n1);
                txtResultado.setText(op1+"");
            }
        });
    }
    public double Suma(double n1,double n2){
        Double e;
        e = n1+n2;
        return e;
    }
    public double Resta(double n1,double n2){
        Double e;
        e = n1-n2;
        return e;
    }
    public double Multiplicacion(double n1,double n2){
        Double e;
        e = n1*n2;
        return e;
    }
    public double Division(double n1,double n2){
        Double e;
        e = n1/n2;
        return e;
    }
    public double Porcentaje(double n1){
        Double e;
        e = n1/100;
        return e;
    }
}