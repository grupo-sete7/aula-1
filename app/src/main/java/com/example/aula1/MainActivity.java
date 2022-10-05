package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.aula1.databinding.ActivityMainBinding;
import com.example.aula1.util.Utils;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private EditText mEditTextName;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        criarBinding();
        iniciarComponentes();
    }

    private void criarBinding() {
        this.mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    private void iniciarComponentes() {
        this.mEditTextName = mBinding.edNome;
        this.mButton = mBinding.btnEnviar;
        this.mButton.setOnClickListener(view -> {
            mudarDeActivity();
        });
    }

    private void mudarDeActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        String nome = this.mEditTextName.getText().toString();
        intent.putExtra(Utils.VALOR, nome);
        startActivity(intent);
    }
}