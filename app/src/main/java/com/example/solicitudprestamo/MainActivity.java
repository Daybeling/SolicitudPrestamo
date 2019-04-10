package com.example.solicitudprestamo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner opciones;
    Spinner interes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);

        opciones = (Spinner)findViewById(R.id.spinnerSexo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);

        interes = (Spinner)findViewById(R.id.spinnerInteres);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Intereses, android.R.layout.simple_spinner_item);
        interes.setAdapter(adapter1);
    }

    public void onClick(View v){

        EditText nombre = findViewById(R.id.editTextNombre); //obtenemos el valor
        String cNombre = nombre.getEditableText().toString();

        EditText telefono = findViewById(R.id.editTextTelefono); //obtenemos el valor
        String cTelefono = telefono.getEditableText().toString();

        EditText cedula = findViewById(R.id.editTextCedula); //obtenemos el valor
        String cCedula = cedula.getEditableText().toString();

        EditText direccion = findViewById(R.id.editTextDireccion); //obtenemos el valor
        String cDireccion = direccion.getEditableText().toString();


        if(cNombre.isEmpty()){
            nombre.setError("campo obligatorio");
        }
        else if(cTelefono.isEmpty()){
            telefono.setError("campo obligatorio");
        }
        else if(cCedula.isEmpty()){
            cedula.setError("campo obligatorio");
        }
        else if(cDireccion.isEmpty()){
            direccion.setError("campo obligatorio");
        }
        else{
            Intent inte = new Intent(getBaseContext(), Main2Activity.class);
            startActivity(inte);
        }

    }
}



