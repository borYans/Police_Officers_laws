package com.upszakoni.zakoni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

public class OffensesRecycler extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offenses_recycler);


        ArrayList<Offenses> offensesArrayList = new ArrayList<>();
        offensesArrayList.add(new Offenses("Лице кое со своето однесување предизвикува сомнение дека е сторител на прекршок или К.Д.", "Член 38 ст.1 т.7 од Закон за Полиција"));
        offensesArrayList.add(new Offenses("Учество и потикнување на тепачка.", "Член 11 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Карање, викање или непристојно дрско однесување.", "Член 4 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Малтретирање друг на јавно место.", "Член 10 ст.1 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Физички напад на друго лице.", "Член 12 ст.1 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Омаловажување на полициски службеник.", "Член 13 ст.2 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Непочитување наредба на УПС.", "Член 14 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Лажно претставување, употреба на лажни податоци.", "Член 23 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Оддавање на уживање на наркотични дроги.", "Член 20 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Реметење на ЈРМ во заеднички простории во кои не живее.", "Член 26 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Не го пријави нарушувањето на ЈРМ во угостителски објект", "Член 33 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Фрлање или кршење шишиња, чаши и други предмети.", "Член 5 од ЗППЈРМ"));
        offensesArrayList.add(new Offenses("Фрлање и оставање хартија, отпушоци, мастики и др.", "Член 14 т.1 од ЗЈЧ"));
        offensesArrayList.add(new Offenses("Продажба и излагање на земјоделски и индустриски производи.", "Член 14 т.10 од ЗЈЧ"));
        offensesArrayList.add(new Offenses("Вршење на физиолошки потреби.", "Член 14 т.19 од ЗЈЧ"));
        offensesArrayList.add(new Offenses("Палење, закопување и уништување на смет", "Член 14-а т.2 од ЗЈЧ"));
        offensesArrayList.add(new Offenses("Уништување на урбана опрема (клупи,фонтатни и сл.)", "Член 14-а т.7 од ЗЈЧ"));
        offensesArrayList.add(new Offenses("Истечена лична карта", "Член 15 ст.1 т.4 од Закон за Лична Карта"));
        offensesArrayList.add(new Offenses("Користи туѓа лична карта или дава на послуга.", "Член 15 ст.10 т.7 од Закон за Лична Карта"));
        offensesArrayList.add(new Offenses("Не носи лична карта или одбива да покаже.", "Член 15 ст.2 од Закон за Лична Карта"));
        offensesArrayList.add(new Offenses("Не носи легитимација.", "Член 75 ст.1 т.4 од Закон за Приватно Обезбедување."));
        offensesArrayList.add(new Offenses("Одбива да покаже легитимација.", "Член 75 ст.1 т.5 од Закон за Приватно Обезбедување."));
        offensesArrayList.add(new Offenses("Не постапи по наредба на УПС.", "Член 76 ст.1 т.7 од Закон за Приватно Обезбедување."));
        offensesArrayList.add(new Offenses("Пушење во јавни простории.", "Член 10 ст.1 од Закон за Заштита од пушењето."));
        offensesArrayList.add(new Offenses("Не го пријави или одјави живеалиштето или престојувалиштето.", "Член 16 од З. за Пријавување на Живеалиште или Престојувалиште."));


        mRecyclerView = findViewById(R.id.recyclerV);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new myRecyclerAdapter(offensesArrayList);

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