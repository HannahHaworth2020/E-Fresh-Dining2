package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class sideMenu extends AppCompatActivity {
    public float side = 2.49f;
    public float subtotal = 0.00f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_item_menu);
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
    public void onClickCartBtn(View view) {
        startActivity(new Intent(getApplicationContext(), SummaryActivity.class));

    }
    public void onClickHomeBtn(View view) {
        startActivity(new Intent(getApplicationContext(), MenuActivity.class));

    }
}
