package com.upszakoni.zakoni;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listV);

        String[] pdfFiles = {"ПРАВИЛНИК ЗА ФОРМАТА И СОДРЖИНАТА НА ПРЕШРОЧНИОТ ПЛАТЕН НАЛОГ (КОВИД-19)","ЈАВЕН РЕД И МИР", "КРИВИЧЕН ЗАКОНИК", "ЗАКОН ЗА КРИВИЧНА ПОСТАПКА", "ЗАКОН ЗА ВРШЕЊЕ НА ПОЛИЦИСКИ РАБОТИ", "ЗАКОН ЗА ЛИЧНА КАРТА", "ЗАКОН ЗА ОРУЖЈЕ",
                "ЗАКОН ЗА ДРЖАВЈАНСТВО", "ЗАКОН ЗА ПРЕКРШОЦИ", "ЗАКОН ЗА ПРИВАТНО ОБЕЗБЕДУВАЊЕ", "ЗАКОН ЗА ЈАВНИТЕ СОБИРИ", "ЗАКОН ЗА ПРИЈАВУВАЊЕ НА ЖИВЕАЛИШТЕ", "ЗАКОН ЗА СПОРТСКИ НАТПРЕВАРИ", "ЗАКОН ЗА СТРАНЦИТЕ",
                "ЗАКОН ЗА ВОЗИЛА", "ЗАКОН ЗА МАТИЧЕН БРОЈ", "ЗБСП", "ЗАКОН ЗА ЈАВНА ЧИСТОТА", "ЗАКОН ЗА ПОЛИЦИЈА", "КОДЕКС НА ПОЛИЦИСКА ЕТИКА", "ПРАВИЛНИК ЗА ВНАТРЕШНА КОНТРОЛА",
                "ПРАВИЛНИК ЗА НОСЕЊЕ НА УНИФОРМА", "УПАТСТВО ЗА ОДНЕСУВАЊЕ И ОДНОСИ НА ПС", "КОЛЕКТИВЕН ДОГОВОР", "ЗАКОН ЗА ВНАТРЕШНИ РАБОТИ", "ЗАКОН ЗА ПАТНИТЕ ИСПРАВИ"};

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = listView.getItemAtPosition(position).toString();
                Intent intent = new Intent(getApplicationContext(), PDFopener.class);
                intent.putExtra("pdfFileName", item);
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.searchIcon);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Пребарувај закони");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
