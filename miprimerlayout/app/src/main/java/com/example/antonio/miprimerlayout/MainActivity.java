package com.example.antonio.miprimerlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);

        /*TextView mitexto = new TextView(this);
        mitexto.setText("Hola mundo !! que tal lo que no le entendi al teacher ajajajaja");
        setContentView(mitexto);*/
    }

}
