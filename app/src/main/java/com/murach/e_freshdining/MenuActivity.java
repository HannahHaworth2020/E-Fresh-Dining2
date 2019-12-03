package com.murach.e_freshdining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.NumberFormat;

public class MenuActivity extends AppCompatActivity {

    public float entree = 8.99f;
    public float side = 2.49f;
    public float sweet = 3.99f;
    public float subtotal = 0.00f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_menu);
    }

    public void onClickCartBtn(View view) {
        startActivity(new Intent(getApplicationContext(), SummaryActivity.class));

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
    public void onClickSide1(View view) {
        subtotal = subtotal + side;
        Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Fresh Garden Salad to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSide2(View view) {
        subtotal = subtotal + side;
        Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Cheesy Cauliflower Rice to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSide3 (View view) {
        subtotal = subtotal + side;
        Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Caesar Salad to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSide4 (View view) {
        subtotal = subtotal + side;
        Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Steamed Vegetables to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSide5 (View view) {
        subtotal = subtotal + side;
        Toast click = Toast.makeText(getApplicationContext(), "Added Side Item: Baked Sweet Potatoes Served with Butter to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSweet1 (View view) {
        subtotal = subtotal + sweet;
        Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Fruit Yogurt Parfait to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSweet2 (View view) {
        subtotal = subtotal + sweet;
        Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Mini Pumpkin Pie topped with  Sugar Free Whipped Cream to Order!", Toast.LENGTH_LONG);
        click.show();
    }
    public void onClickSweet3 (View view) {
        subtotal = subtotal + sweet;
        Toast click = Toast.makeText(getApplicationContext(), "Added Sweet Treat: Blueberry Coconut Ice Cream (Vegan) to Order!", Toast.LENGTH_LONG);
        click.show();
    }

    public void onClickHomeBtn(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

}

