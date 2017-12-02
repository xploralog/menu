package com.salomon.ejemplomenus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        getMenuInflater().inflate(R.menu.menu1,m);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)

    {

        switch (item.getItemId()) {
            case R.id.opcion1:
                Intent intento1 = new Intent(this, MainActivity.class);
                startActivity(intento1);
                return true;

            case R.id.opcion2:
                Intent intento2 = new Intent(this, Main2Activity.class);
                startActivity(intento2);
                return true;

            case R.id.opcion3:
                Intent intento3 = new Intent(this, Main3Activity.class);
                startActivity(intento3);
                return true;


            default:
                return super.onOptionsItemSelected(item);


        }
    }

    }
