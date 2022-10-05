package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.aula1.util.Utils;

public class MainActivity2 extends AppCompatActivity {
    private TextView mTextViewNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.mTextViewNome = findViewById(R.id.tv_nome);
        pegarString();
    }

    private void pegarString() {
        Bundle extras = getIntent().getExtras();
        String nome = extras.getString(Utils.VALOR);
        System.out.println(nome);
        this.mTextViewNome.setText(nome);
    }
}