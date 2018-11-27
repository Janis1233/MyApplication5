package com.example.janis.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class BezahlungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezahlung);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.essen:
                        Intent essenIntent =new Intent(getApplicationContext(), EssenActivity.class);
                        startActivity(essenIntent);
                        break;

                    case R.id.bezahlungen:
                        Intent bezahlungIntent =new Intent(getApplicationContext(), BezahlungActivity.class);
                        startActivity(bezahlungIntent);
                        break;

                    case R.id.einstellungen:
                        Intent einstellungenIntent = new Intent(getApplicationContext(), EinstellungenActivity.class);
                        startActivity(einstellungenIntent);
                        break;

                    case R.id.profil:
                        Intent profilIntent =new Intent(getApplicationContext(), ProfilActivity.class);
                        startActivity(profilIntent);
                        break;
                }
                return true;

            }
        });
    }
}
