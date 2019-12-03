package com.murach.e_freshdining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
    public void onClickContactSubmit(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        Toast click = Toast.makeText(getApplicationContext(), "One of our representatives will contact you shortly!", Toast.LENGTH_LONG);
        click.show();
    }
}
