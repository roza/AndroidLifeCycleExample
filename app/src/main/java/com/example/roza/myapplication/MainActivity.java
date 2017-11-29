package com.example.roza.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Bienvenue, ceci est un Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    @Override
    public void onPause(){
        super.onPause() ;
        Toast.makeText(this, "Passage  OnPause", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStart(){
        super.onStart() ;
        Toast.makeText(this, "Passage  OnStart", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRestart(){
        super.onRestart()       ;
        Toast.makeText(this, "Passage OnReStart", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume(){
        super.onResume()        ;
        Toast.makeText(this, "Passage  OnResume", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "Passage  OnStop", Toast.LENGTH_LONG).show();

    }

    }
