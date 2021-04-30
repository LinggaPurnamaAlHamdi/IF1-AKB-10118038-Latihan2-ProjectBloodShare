/**
 Tanggal pengerjaan : 29 April 2021
 NIM : 10118038
 Nama : Lingga Purnama Al Hamdi
 Kelas : IF-1
 **/
package com.example.projectbloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
    public void verify(View view) {
        Intent intent1 = new Intent(this, Verify.class);
        startActivity(intent1);
        finish();
    }
}