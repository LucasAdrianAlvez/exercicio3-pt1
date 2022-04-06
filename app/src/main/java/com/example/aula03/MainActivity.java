package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity implements View.OnClickListener {

    private TextView tv1;
    private  EditText e0;
    private  EditText e1;
    private  EditText e2;
    private Button bt2;
    private String name;
    private String email;
    private String senha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        e1 = (EditText) findViewById(R.id.e1);
        e0 = (EditText) findViewById(R.id.e0);
        e2 = (EditText) findViewById(R.id.e2);

        bt2 = (Button) findViewById(R.id.bt2);








        bt2.setOnClickListener(this);



    }
    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putString("chaveNome", name);
    }



    @Override
    public void onClick(View view) {



        if(view.getId()==R.id.bt2){
            name = e0.getText().toString();
            email = e1.getText().toString();
            senha = e2.getText().toString();

            if(email.equals("abc@gmail.com")) {
                if(senha.equals("1234")){
                Intent intent = new Intent(this, BemVindoActivity.class);
                Bundle params = new Bundle();
                params.putString("chaveNome", name);
                intent.putExtras(params);
                startActivity(intent);
            } }else{

                Toast.makeText(this, "Email ou senha errados", Toast.LENGTH_SHORT).show();
            }
        }


    }
}