package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sweetMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet_treat_menu);
        Button button1 = findViewById(R.id.addSweetTreatBtn1);
        Button button2 = findViewById(R.id.addSweetTreatBtn2);
        Button button3 = findViewById(R.id.addSweetTreatBtn3);
        Button button6 = findViewById(R.id.cartBtn2);
        Button button7 = findViewById(R.id.homePageBtn3);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Fruit Yogurt Parfait to Order!", Toast.LENGTH_LONG);
                click.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Mini Pumpkin Pie topped with  Sugar Free Whipped Cream to Order!", Toast.LENGTH_LONG);
                click.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Blueberry Coconut Ice Cream (Vegan) to Order!", Toast.LENGTH_LONG);
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
