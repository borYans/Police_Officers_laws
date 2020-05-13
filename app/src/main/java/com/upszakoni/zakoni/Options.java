package com.upszakoni.zakoni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Options extends AppCompatActivity implements View.OnClickListener {


    private CardView prekrsoci, krivicni, zakoni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        prekrsoci = findViewById(R.id.prekrsociCard);
        krivicni = findViewById(R.id.krivicniCard);
        zakoni = findViewById(R.id.zakoniCard);

        prekrsoci.setOnClickListener(this);
        krivicni.setOnClickListener(this);
        zakoni.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.prekrsociCard:
                i = new Intent(this, OffensesRecycler.class);
                startActivity(i);
                break;
            case R.id.krivicniCard:
                i = new Intent(this, Crimes.class);
                startActivity(i);
                break;
            case R.id.zakoniCard:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            default:
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.shareBtn:
                Intent intent = new Intent();
                intent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=com.upszakoni.zakoni";
                intent.putExtra(intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share app"));
        }
        return super.onOptionsItemSelected(item);
    }

}
