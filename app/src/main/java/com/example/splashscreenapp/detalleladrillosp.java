package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class detalleladrillosp extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleladrillosp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main1, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView8:
                Intent intent = new Intent(this, usuario_cliente_catalogo.class);
                startActivity(intent);
                break;

        }
    }
}