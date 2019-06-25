package com.example.intent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
        String[] message = intent.getStringArrayExtra("strings");

        TextView textViewUser = findViewById(R.id.textViewU);
        textViewUser.setText(message[0]);

        TextView textViewTelefono = findViewById(R.id.textViewT);
        textViewTelefono.setText(message[1]);
    }

    public void Call(View view) {

        Log.i("test", "prueba");
        Intent intent = getIntent();
        String[] message = intent.getStringArrayExtra("strings");
        String numero = message[1];
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);

        Log.i("test", numero);

        phoneIntent.setData(Uri.parse("tel:"+numero));
        startActivity(phoneIntent);



    }
}
