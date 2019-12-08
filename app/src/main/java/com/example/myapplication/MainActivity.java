package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button BtnLogin;
    EditText txtUser, txtContra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnLogin = findViewById(R.id.button1);
        txtUser = findViewById(R.id.txtUser);
        txtContra = findViewById(R.id.txtContra);




        BtnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Log.i("APP","Click en login");

        String email= txtUser.getText().toString();
        String contra= txtContra.getText().toString();

        if(!email.isEmpty() && !contra.isEmpty()){
            //Intent -> intercambiar datos de un activity a otro
            Intent intentLogin = new Intent(this,HomeActivity.class); //( donde estas, a donde quieres ir)
            intentLogin.putExtra("valorEmail",email);
            startActivity(intentLogin);
        }else {
            txtUser.setError("Complete el email y la contraseña");
        }


    }
}
