package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sideMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_item_menu);
        Button button1 = findViewById(R.id.addSideItemBtn1);
        Button button2 = findViewById(R.id.addSideItemBtn2);
        Button button3 = findViewById(R.id.addSideItemBtn3);
        Button button4 = findViewById(R.id.addSideItemBtn4);
        Button button5 = findViewById(R.id.addSideItemBtn5);
        Button button6 = findViewById(R.id.cartBtn2);
        Button button7 = findViewById(R.id.homePageBtn3);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Fresh Garden Salad to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Cheesy Cauliflower Rice to Order!", Toast.LENGTH_LONG);
                click.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Caesar Salad to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Steamed Vegetables to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Baked Sweet Potatoes Served with Butter to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SummaryActivity.class));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });
    }



}


