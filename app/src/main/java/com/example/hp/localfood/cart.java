package com.example.hp.localfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        car_var val = ((car_var) getApplicationContext());
        String temp = val.getvar();


            TextView txt = (TextView) findViewById(R.id.ctex);
            txt.setText(temp);

    }
}
