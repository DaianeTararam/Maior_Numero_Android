/*
 *@author: Daiane Tararam
 *RA: 1110482322003
 */

package com.example.maiormenorsomar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1;
    private EditText etNum2;
    private Button btnDescubra;
    private Button btnSomar;
    private TextView tvMaior;
    private TextView tvSoma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etNum1 = findViewById(R.id.etNum1);
        etNum1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etNum2 = findViewById(R.id.etNum2);
        etNum2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnDescubra = findViewById(R.id.btnDescubra);
        btnDescubra.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnDescubra.setOnClickListener(op -> descobrir());
        btnSomar = findViewById(R.id.btnSomar);
        btnSomar.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnSomar.setOnClickListener(op -> somar());
        tvMaior = findViewById(R.id.tvMaior);
        tvMaior.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tvSoma = findViewById(R.id.tvSoma);
        tvSoma.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

    }

    private void somar() {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int total = num1 + num2;
        String respSoma = getString(R.string.tvSoma) + " " + total;
        tvSoma.setText(respSoma);
    }


    private void descobrir() {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int maior = Math.max(num1, num2);
        String resposta = getString(R.string.tvMaior) + " " + maior;
        tvMaior.setText(resposta);
    }
}