package com.example.micajavecina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_admin);
    }

    public void Anterior(View View) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}