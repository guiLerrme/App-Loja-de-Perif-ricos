package com.example.trabalhojulio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int temaescuro = 0;
    int logar = 0;

    Button botaoRegistro;
    EditText textoregistroemail, textoregistrosenha;

    String Login = "";
    String Pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoMudarTema = findViewById(R.id.button);
        botaoMudarTema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clicando(v);
            }
        });

        botaoRegistro = findViewById(R.id.button_conf);

        botaoRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrar(v);
            }
        });

        Button botaoLogar = findViewById(R.id.button_logar);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logar(v);
            }
        });

        textoregistroemail = findViewById(R.id.emailEditText);
        textoregistrosenha = findViewById(R.id.passwordEditText);
    }

    public void Registrar(View v)
    {
        String textoEmail = textoregistroemail.getText().toString();
        String textoSenha = textoregistrosenha.getText().toString();

        if (textoEmail.isEmpty() || textoSenha.isEmpty())
        {
            Toast.makeText(this, "Usuário ou senha indisponivel", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Login = textoregistroemail.getText().toString();
            Pass = textoregistrosenha.getText().toString();
            Toast.makeText(this, "Conta Registrada", Toast.LENGTH_SHORT).show();
            logar = 1;
        }
    }

    public void Logar(View v) {
        String checkLogin = textoregistroemail.getText().toString();
        String checkSenha = textoregistrosenha.getText().toString();

        if (checkLogin.isEmpty() || checkSenha.isEmpty())
        {
            Toast.makeText(this, "Usuário ou senha indisponivel", Toast.LENGTH_SHORT).show();
        }
        else {
            if (!checkLogin.equals(Login) || !checkSenha.equals(Pass)) {
                Toast.makeText(this, "Login ou senha não combinam com o registrado", Toast.LENGTH_SHORT).show();
            } else {
                if (logar == 1) {
                    Toast.makeText(this, "Você logou", Toast.LENGTH_SHORT).show();
                    Intent in =  new Intent(MainActivity.this, SegundatelaActivity.class);
                    startActivity(in);}

                else {
                    Toast.makeText(this, "Você precisa registrar primeiro", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

    public void Clicando(View v)
    {
        Toast.makeText(this, temaescuro == 1 ? "Mudou para tema claro" : "Mudou para tema escuro", Toast.LENGTH_SHORT).show();

        if(temaescuro == 0)
        {
            v.getRootView().setBackgroundColor(0xFF000000);
            temaescuro = 1;
        }
        else
        {
            v.getRootView().setBackgroundColor(0xFFFFFFFF);
            temaescuro = 0;
        }
    }
}
