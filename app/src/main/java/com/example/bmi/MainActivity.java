package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextInputEditText textedit1,textedit2;

    Button btnsubmit;

    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textedit1 = findViewById(R.id.textedit1);
        textedit2 = findViewById(R.id.textedit2);
        txt1 = findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        btnsubmit= findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Weight = Integer.parseInt(textedit1.getText().toString());
                double height = Integer.parseInt(textedit2.getText().toString());
                double ans;

                ans = Weight/((height/100) * (height/100));
                txt2.setText(new DecimalFormat().format(ans));
            }
        });
    }
}