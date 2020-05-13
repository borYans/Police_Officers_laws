package com.upszakoni.zakoni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



import java.util.ArrayList;

public class Crimes extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crimes);



        ArrayList<CrimesData> crimesData = new ArrayList<>();
        crimesData.add(new CrimesData("Кражба", "чл.235 од КЗ"));
        crimesData.add(new CrimesData("Тешка кражба", "чл.236 од КЗ"));
        crimesData.add(new CrimesData("Разбојништво", "чл.237 од КЗ"));
        crimesData.add(new CrimesData("Разбојничка кражба", "чл.238 од КЗ"));
        crimesData.add(new CrimesData("Предвизвикување општа опасност", "чл.288 од КЗ"));
        crimesData.add(new CrimesData("Убиство", "чл.123 од КЗ"));
        crimesData.add(new CrimesData("Одземање на моторно возило", "чл.243 од КЗ"));
        crimesData.add(new CrimesData("Соивршителство во кривично дело", "чл.22  од КЗ"));
        crimesData.add(new CrimesData("Потикнувње на кривично дело", "чл.23 од КЗ"));
        crimesData.add(new CrimesData("Криумчарење", "чл.278 од КЗ"));
        crimesData.add(new CrimesData("Изнуда", "чл.258 од КЗ"));
        crimesData.add(new CrimesData("Уцена", "чл.259 од КЗ"));
        crimesData.add(new CrimesData("Неукажување помош на лице повредено во сообраќајна незгода", "чл.301 од КЗ"));
        crimesData.add(new CrimesData("Противправно лишување од слобода", "чл.140 од КЗ"));
        crimesData.add(new CrimesData("Неовластено производство и пуштање во промет\n" +
                "на наркотични дроги, психотропни супстанции и прекурсори", "чл.215 од КЗ"));
        crimesData.add(new CrimesData("Пустошење на шума", "чл.226 од КЗ"));
        crimesData.add(new CrimesData("Предизвикување шумски пожар", "чл.227 од КЗ"));
        crimesData.add(new CrimesData("Мачење животни", "чл.233 од КЗ"));



        mRecyclerView = findViewById(R.id.recyclerV);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new CrimesRecyclerAdapter(crimesData);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
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
