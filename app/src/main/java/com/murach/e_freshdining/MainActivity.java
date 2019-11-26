package com.murach.e_freshdining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    // Variables
    private Button button_order;
    private Button button_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References to widgets
        button_order = (Button) findViewById(R.id.button_order);
        button_contact = (Button) findViewById(R.id.button_contact);

        // Listeners for button clicks
        button_order.setOnClickListener(this);
        button_contact.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Allows you to click on main activity buttons to open other pages.

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_order:
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                break;
            case R.id.button_contact:
                startActivity(new Intent(getApplicationContext(), ContactActivity.class));
                break;


        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
