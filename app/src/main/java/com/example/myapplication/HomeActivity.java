package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ListView lista;
    List<String> androidVersionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        lista = findViewById(R.id.listView);
        androidVersionList = new ArrayList<>();

        //Con estas 2 líneas traigo lo del "Intent"
        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("valorEmail");

        //Vamos a ponerle un titulo
        setTitle("Vista General");

        androidVersionList.add("Pie");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("Marshmallow");
        androidVersionList.add("Lollipop");
        androidVersionList.add("Kitkat");
        androidVersionList.add("...");

        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(this,android.R.layout.simple_list_item_1,androidVersionList);

        lista.setAdapter(adaptadorVersionesAndroid);


        Toast.makeText(this,"Bienvenido "+ emailUsuario, Toast.LENGTH_LONG).show();
    }
}
