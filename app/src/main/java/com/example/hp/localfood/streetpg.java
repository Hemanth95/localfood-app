package com.example.hp.localfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class streetpg extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streetpg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(streetpg.this, cart.class);
                startActivity(intent);
            }
        });
         ImageButton btn1 = (ImageButton) findViewById(R.id.panistall);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten;
                inten = new Intent(streetpg.this,panipuri_stall.class);
                startActivity(inten);
            }
        });
        Button btn11 =(Button) findViewById(R.id.panienter);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(streetpg.this,panipuri_stall.class);
                startActivity(intentt);
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.churmuristall);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten;
                inten = new Intent(streetpg.this,Churumuri_Stall.class);
                startActivity(inten);
            }
        });
        Button btn21 =(Button) findViewById(R.id.churumurienter);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(streetpg.this,Churumuri_Stall.class);
                startActivity(intentt);
            }
        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.gobistall);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten;
                inten = new Intent(streetpg.this,Gobi_stall.class);
                startActivity(inten);
            }
        });
        Button btn31 =(Button) findViewById(R.id.gobienter);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(streetpg.this,Gobi_stall.class);
                startActivity(intentt);
            }
        });






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.streetpg, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id==R.id.stchat){
            Toast.makeText(this, "streat chat selected", Toast.LENGTH_SHORT).show();
            Intent st = new Intent(streetpg.this,streetpg.class);
            startActivity(st);
        }
         else if(id==R.id.ff){
            Intent fast = new Intent(streetpg.this,Fast_food.class);
            startActivity(fast);
        }
       else if(id==R.id.htls){
            Intent rest = new Intent(streetpg.this,Restaurants.class);
            startActivity(rest);
        }
        else if(id==R.id.ss){
            Toast.makeText(this,"coming soon",Toast.LENGTH_SHORT).show();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
