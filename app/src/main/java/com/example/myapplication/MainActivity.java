package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView txtview;
    private Button plus;
    private Button minus;
    private int szamlalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        init();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo++;
                txtview.setText(String.valueOf(txtview));
                if (szamlalo<0){
                    txtview.setTextColor(Color.RED);
                }else if (szamlalo>0){
                    txtview.setTextColor(Color.GREEN);
                }else{
                    txtview.setTextColor(Color.BLUE);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo--;
                txtview.setText(String.valueOf(szamlalo));
                if (szamlalo<0){
                    txtview.setTextColor(Color.RED);
                }else if (szamlalo>0){
                    txtview.setTextColor(Color.GREEN);
                }else{
                    txtview.setTextColor(Color.BLUE);
                }
            }
        });
    }
    private void init() {
        layout = findViewById(R.id.layout);
        txtview = findViewById(R.id.txtview);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        szamlalo = 0;


    }
}