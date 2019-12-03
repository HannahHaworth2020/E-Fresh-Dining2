package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void onClickSubmit(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        setContentView(R.layout.activity_main);
        Toast click = Toast.makeText(getApplicationContext(), "Your order has been submitted!", Toast.LENGTH_LONG);
        click.show();
        click = Toast.makeText(getApplicationContext(), "Your order will be ready for pick up in twenty minutes", Toast.LENGTH_LONG);
        click.show();

    }

    public void onClickShop(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));

    }

}




