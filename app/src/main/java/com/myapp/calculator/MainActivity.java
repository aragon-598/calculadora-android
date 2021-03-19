package com.myapp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        respuesta = findViewById(R.id.respuesta);
    }

    public void add(View view){
        Integer respuestaF = Integer.parseInt(num1.getText().toString())  + Integer.parseInt(num2.getText().toString());
        respuesta.setText(respuestaF+"");
    }
    public void resta(View view){
        Integer respuestaF = Integer.parseInt(num1.getText().toString())  - Integer.parseInt(num2.getText().toString());
        respuesta.setText(respuestaF+"");
    }
    public void multiply(View view){
        Integer respuestaF = Integer.parseInt(num1.getText().toString())  * Integer.parseInt(num2.getText().toString());
        respuesta.setText(respuestaF+"");
    }
    public void divide(View view){
        Integer respuestaF = Integer.parseInt(num1.getText().toString())  / Integer.parseInt(num2.getText().toString());
        respuesta.setText(respuestaF+"");
    }
}