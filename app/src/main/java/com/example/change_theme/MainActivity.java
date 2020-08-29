package com.example.change_theme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme( R.style.DarkTheme );
        } else {
            setTheme( R.style.LigthTheme );
        }
        setContentView( R.layout.activity_main );

        TextView tvChangeTheme = findViewById( R.id.tvChangeTheme );
        tvChangeTheme.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_NO );
                }else{
                    AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_YES );
                }
                finish();
                startActivity( new Intent( MainActivity.this, MainActivity.this.getClass() ) );
            }
        } );
    }
}
