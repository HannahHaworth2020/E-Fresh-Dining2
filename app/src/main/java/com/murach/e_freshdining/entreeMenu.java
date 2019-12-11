package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class entreeMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree_menu);
        Button button1 = findViewById(R.id.addEntreeBtn1);
        Button button2 = findViewById(R.id.addEntreeBtn2);
        Button button3 = findViewById(R.id.addEntreeBtn3);
        Button button4 = findViewById(R.id.addEntreeBtn4);
        Button button5 = findViewById(R.id.addEntreeBtn5);
        Button button6 = findViewById(R.id.addEntreeBtn6);
        Button button7 = findViewById(R.id.addEntreeBtn7);
        Button button8 = findViewById(R.id.addEntreeBtn8);
        Button button9 = findViewById(R.id.addEntreeBtn9);
        Button button10 = findViewById(R.id.addEntreeBtn10);
        Button button11 = findViewById(R.id.cartBtn2);
        Button button12 = findViewById(R.id.homePageBtn3);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Salmon with mixed grilled vegetables to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Fresh Seaweed wrapped Sushi to Order!", Toast.LENGTH_LONG);
                click.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Chicken Fiesta Tacos to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Vegetable Pizza with a Crisp Cauliflower Crust to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Pepper Steak, grilled with fresh bell peppers to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Sesame Lemon Grilled Chicken to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Salmon with Lemon-Pepper Lentils to Order!", Toast.LENGTH_LONG);
                click.show();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Fresh Caught Oysters to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Chicken Parmesan with Tomato Basil Pasta  to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Turkey Meatball Spaghetti with Spaghetti Squash Noodles to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SummaryActivity.class));
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });

    }


}