package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {
private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);


        t = (TextView)  findViewById(R.id.tvNova);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("chaveNome");

        t.setText(nome+", Seja Bem - vindo");
    }
}