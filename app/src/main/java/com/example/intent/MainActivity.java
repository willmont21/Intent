package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        Intent intent = new Intent(this, Login.class);
        EditText NombreUser = (EditText) findViewById(R.id.user);
        EditText TelefonoUser = (EditText) findViewById(R.id.clave);

        String User=NombreUser.getText().toString();
        String Telefono=TelefonoUser.getText().toString();


        String[] Datos = new String[]{
                "  "+User,
                "  "+Telefono,
        };

        intent.putExtra("strings",Datos);
        startActivity(intent);
    }


}
