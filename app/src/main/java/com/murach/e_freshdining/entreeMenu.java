package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class entreeMenu extends AppCompatActivity {
    public float entree = 8.99f;
    public float subtotal = 0.00f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree_menu);
    }

    public void onClickCartBtn(View view) {
        startActivity(new Intent(getApplicationContext(), SummaryActivity.class));

    }

    public void onClickHomeBtn(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));

    }
    public void onClickEntree1(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Salmon with mixed grilled vegetables to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree2(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Fresh Seaweed wrapped Sushi to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree3(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Chicken Fiesta Tacos to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree4(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Vegetable Pizza with a Crisp Cauliflower Crust to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree5(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Pepper Steak, grilled with fresh bell peppers to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree6(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Sesame Lemon Grilled Chicken to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree7(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Grilled Salmon with Lemon-Pepper Lentils to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree8(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Fresh Caught Oysters to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree9(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Chicken Parmesan with Tomato Basil Pasta  to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickEntree10(View view) {
        subtotal = subtotal + entree;
        Toast click = Toast.makeText(getApplicationContext(), "Added Entree: Turkey Meatball Spaghetti with Spaghetti Squash Noodles to Order!", Toast.LENGTH_LONG);
        click.show();
    }
}