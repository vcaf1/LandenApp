package com.casperdaris.beroepsproductgroepc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.casperdaris.beroepsproductgroepc.Objecten.Regio;

public class MainActivity extends AppCompatActivity {

    private Button testKnop, toevoegKnop;
    private EditText regioNaamEditText, regioBeschrijvingEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testKnop = findViewById(R.id.naarTabButton);
        toevoegKnop = findViewById(R.id.regioToevoegKnop);
        regioNaamEditText = findViewById(R.id.regioNaamEditText);
        regioBeschrijvingEditText = findViewById(R.id.regioBeschrijvingEditText);

        testKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), RegioActivity.class);
                startActivity(i);
            }
        });

        toevoegKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Regio maken om aan database toe te voegen
                Regio regio;

                // Proberen om een nieuwe regio aan te maken, anders een foutmelding geven
                try {
                    regio = new Regio(regioNaamEditText.getText().toString(), regioBeschrijvingEditText.getText().toString(), null, null, null, null, null, null);
                    Toast.makeText(MainActivity.this, "Regio toevoegen gelukt", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Er is een fout opgetreden", Toast.LENGTH_LONG).show();
                    regio = new Regio("fout", "fout", null, null, null, null, null, null);
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);

                // De database helper gebruiken om een nieuwe regio toe te voegen aan de database
                databaseHelper.regioToevoegen(regio);

            }
        });
    }
}
