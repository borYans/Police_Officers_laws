package com.upszakoni.zakoni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFopener extends AppCompatActivity {

    PDFView myPdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_fopener);

        myPdfView = (PDFView) findViewById(R.id.pdfOpener);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("ПРАВИЛНИК ЗА ФОРМАТА И СОДРЖИНАТА НА ПРЕШРОЧНИОТ ПЛАТЕН НАЛОГ (КОВИД-19)")) {
            myPdfView.fromAsset("prekrsocen_platen.pdf").load();
        }
        if (getItem.equals("ЈАВЕН РЕД И МИР")) {
            myPdfView.fromAsset("JRM.pdf").load();
        }
        if (getItem.equals("КРИВИЧЕН ЗАКОНИК")) {
            myPdfView.fromAsset("Krivicen zakonik.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ЛИЧНА КАРТА")) {
            myPdfView.fromAsset("Zakon za LK.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ОРУЖЈЕ")) {
            myPdfView.fromAsset("ZAKON ZA ORUZJETO.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ДРЖАВЈАНСТВО")) {
            myPdfView.fromAsset("Zakon za drzavjanstvo.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ПРЕКРШОЦИ")) {
            myPdfView.fromAsset("Zakon za prekrsoci.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ПРИВАТНО ОБЕЗБЕДУВАЊЕ")) {
            myPdfView.fromAsset("ZAKON ZA PRIVATNO OBEZBEDUVANJE.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ЈАВНИТЕ СОБИРИ")) {
            myPdfView.fromAsset("Zakon za javnite sobiri.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ПРИЈАВУВАЊЕ НА ЖИВЕАЛИШТЕ")) {
            myPdfView.fromAsset("Zakon za prijavuvanje na zivealiste i prestojuvaliste.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА СПОРТСКИ НАТПРЕВАРИ")) {
            myPdfView.fromAsset("Zakon za sprecuvanje nasilstvo na sportski natprevari.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА СТРАНЦИТЕ")) {
            myPdfView.fromAsset("Zakon za strancite.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ВОЗИЛА")) {
            myPdfView.fromAsset("zakon za vozilaa.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА МАТИЧЕН БРОЈ")) {
            myPdfView.fromAsset("Zakon za maticen broj.pdf").load();
        }
        if (getItem.equals("ЗБСП")) {
            myPdfView.fromAsset("ZBSP.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ЈАВНА ЧИСТОТА")) {
            myPdfView.fromAsset("ZJC.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ПОЛИЦИЈА")) {
            myPdfView.fromAsset("ZP.pdf").load();
        }
        if (getItem.equals("КОДЕКС НА ПОЛИЦИСКА ЕТИКА")) {
            myPdfView.fromAsset("Kodeks na policiska etika.pdf").load();
        }
        if (getItem.equals("ПРАВИЛНИК ЗА ВНАТРЕШНА КОНТРОЛА")) {
            myPdfView.fromAsset("pravilnik Vnatresna kontrola Final.pdf").load();
        }
        if (getItem.equals("ПРАВИЛНИК ЗА НОСЕЊЕ НА УНИФОРМА")) {
            myPdfView.fromAsset("Pravilnik za nosenjeto i vremetraenjeto na uniformata na policijata 76-07.pdf").load();
        }
        if (getItem.equals("УПАТСТВО ЗА ОДНЕСУВАЊЕ И ОДНОСИ НА ПС")) {
            myPdfView.fromAsset("Upatstvo za odnesuvanje i megjusebnite odnosi na PS.pdf").load();
        }

        if (getItem.equals("КОЛЕКТИВЕН ДОГОВОР")) {
            myPdfView.fromAsset("kolektiven dogovor.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ПАТНИТЕ ИСПРАВИ")) {
            myPdfView.fromAsset("zakon za patnite ispravi.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ВНАТРЕШНИ РАБОТИ")) {
            myPdfView.fromAsset("zakon za vnatresni rab.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА КРИВИЧНА ПОСТАПКА")) {
            myPdfView.fromAsset("zakon za krivicna postapka.pdf").load();
        }
        if (getItem.equals("ЗАКОН ЗА ВРШЕЊЕ НА ПОЛИЦИСКИ РАБОТИ")) {
            myPdfView.fromAsset("zakon za krivicna postapka.pdf").load();
        }

    }
}
