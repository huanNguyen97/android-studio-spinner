package com.example.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    // Set data initialize
    String[] bankNames = {
            "BOI",
            "SBI",
            "HDFC",
            "PNB",
            "OBC"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating the Spinner and applying it.
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        // Creating the adapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                bankNames
        );

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(
            AdapterView<?> arg0,
            View arg1,
            int position,
            long id
    ) {
        Toast.makeText(
                getApplicationContext(),
                bankNames[position],
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}