package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NormalPeso extends AppCompatActivity {
    TextView tvNombre,tvDieta;
    ImageView imgAvatar,imgA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_peso);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvDieta = (TextView)findViewById(R.id.tvDieta);

        imgAvatar = (ImageView)findViewById(R.id.imgAvatar);
        imgA = (ImageView)findViewById(R.id.imgA);

        String nombre = getIntent().getStringExtra("nombre");
        String mensaje = getIntent().getStringExtra("mensaje");
        String imc = getIntent().getStringExtra("imc");
        String condicion = getIntent().getStringExtra("condicion");
        String dieta ="";

        tvNombre.setText("Hola "+nombre);
        imgAvatar.setImageResource(R.drawable.img1);

        if (condicion.equals("bajo")) {
            dieta = " Asi que te recomendamos consumir más alimentos ricos en proteínas como carnes rojas, blancas, huevo, leche y verduras";
            imgA.setImageResource(R.drawable.bajo);
        }else if (condicion.equals("alto")) {
            dieta = "Debes limitar el consumo de alimentos que sean ricos en azúcares y grasas, hacer actividad fisica de manera constane y consumir frutas";
            imgA.setImageResource(R.drawable.alto);
        }
        tvDieta.setText(nombre+" El resultado de tu IMC es de "+imc+", por ende eres "+mensaje+dieta);


    }
}