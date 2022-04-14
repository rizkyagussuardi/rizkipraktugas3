package com.example.rizkipraktugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input (View view){
        EditText inputnamatimA = findViewById(R.id.edt_Tim_A);
        EditText inputnamatimB = findViewById(R.id.edt_Tim_B);

        String namatimA = inputnamatimA.getText().toString();
        Log.d(TAG, namatimA);
        String namatimB = inputnamatimB.getText().toString();
        Log.d(TAG, namatimB);

        Intent intent = new Intent(MainActivity.this, activity_skor.class);
        intent.putExtra("Tim A", namatimA);
        intent.putExtra("Tim B", namatimB);
        startActivity(intent);
    }


}