package com.example.micajavecina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class usuario_admin extends AppCompatActivity {
    Spinner combo;
    TextView ete;
    int c=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_admin);
        ete = (TextView) findViewById(R.id.textoSpinner);
        combo = (Spinner) findViewById(R.id.spinnerEstado);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView)v.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                }
                return v;
            }
            @Override
            public int getCount() {
                return super.getCount()-1; // no se muestra el ultimo item
            }
        };
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("SI");
        adapter.add("NO");
        adapter.add("SELECCIONE SI DISPONE DE CUPO");

        combo.setAdapter(adapter);
        combo.setSelection(adapter.getCount());
        combo.setPrompt("¿TIENE CUPO SU CAJA VECINA?");

       combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if (c==0) c++;
                       else{
                   ete.setText(parent.getSelectedItem().toString());
                  
               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

    }


}


