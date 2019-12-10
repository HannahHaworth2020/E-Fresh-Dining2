package com.murach.e_freshdining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClickEntreeMenu(View view) {
        startActivity(new Intent(getApplicationContext(),entreeMenu.class));
    }
    public void onClickSideMenu(View view) {
        startActivity(new Intent(getApplicationContext(),sideMenu.class));
    }
    public void onClickSweetMenu(View view) {
        startActivity(new Intent(getApplicationContext(),sweetMenu.class));
    }
    public void onClickHomePage(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

}

