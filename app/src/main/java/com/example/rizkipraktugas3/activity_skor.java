package com.example.rizkipraktugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_skor extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;
    TextView nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namatimA = findViewById(R.id.tv_Tim_A);
        TextView namatimB = findViewById(R.id.tv_Tim_B);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namatimA.setText("Team" + " " + namaA);
        namatimB.setText("Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.btn_poin1A) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.btn_poin2A) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.btn_poin3A) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.btn_poin1B) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.btn_poin2B) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.btn_poin3B) {
            skorB = skorB + 3;
        }

        TextView skortimA = findViewById(R.id.tv_Skor_Tim_A);
        TextView skortimB = findViewById(R.id.tv_Skor_Tim_B);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));

    }
    public void Reset(View view){
        if(view.getId()==R.id.btn_resetA) {
            skorA = 0;

        }
        else if (view.getId()==R.id.btn_resetB) {
            skorB = 0;

        }
        TextView skortimA = findViewById(R.id.tv_Skor_Tim_A);
        TextView skortimB = findViewById(R.id.tv_Skor_Tim_B);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}