package com.example.quadraticequation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button btn_next, btn_random;
    public EditText ed_a, ed_b, ed_c;
    int a, b, c;
    String st_a, st_b, st_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed_a = findViewById(R.id.ed_a);
        ed_b = findViewById(R.id.ed_b);
        ed_c = findViewById(R.id.ed_c);
        btn_next = findViewById(R.id.btn_next);
        btn_random = findViewById(R.id.btn_random);
    }

    public void random(View view) {
        Random rnd = new Random();
        a = rnd.nextInt(100);
        b = rnd.nextInt(100);
        c = rnd.nextInt(100);
        ed_a.setText(""+a);
        ed_b.setText(""+b);
        ed_c.setText(""+c);
    }

    public void next(View view) {
        st_a = ed_a.getText().toString();
            a = Integer.parseInt(st_a);

        st_b = ed_b.getText().toString();
        b = Integer.parseInt(st_b);

        st_c = ed_c.getText().toString();
        c = Integer.parseInt(st_c);

        Intent si = new Intent(this,ActivitySolution.class);
        si.putExtra("n",a);
        si.putExtra("nn",b);
        si.putExtra("nnn",c);
        startActivity(si);
    }
}
