package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoardPertama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_pertama);

        LinearLayout buttonLogin = findViewById(R.id.ButtonLogin);
        LinearLayout buttonRegister = findViewById(R.id.ButtonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardPertama.this, FormLogin.class);
                startActivity(intent);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardPertama.this, FormRegister.class);
                startActivity(intent);
            }
        });

        LinearLayout btntanya = findViewById(R.id.ButtonTanya);
        btntanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Handynandaf@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Pertanyaan ke Admin");
                intent.putExtra(Intent.EXTRA_TEXT, "Halo Admin, saya ingin bertanya...");
                startActivity(Intent.createChooser(intent, "Kirim Email menggunakan:"));
            }
        });
    }
}
