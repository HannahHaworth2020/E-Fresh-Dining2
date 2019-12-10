package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class sweetMenu extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sweet_treat_menu);
        }

    public float sweet = 3.99f;
    public float subtotal = 0.00f;

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
        public void onClickCartBtn(View view) {
            startActivity(new Intent(getApplicationContext(), SummaryActivity.class));

        }
    public void onClickHomeBtn(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));

    }
}
