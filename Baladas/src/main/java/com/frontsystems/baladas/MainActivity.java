package com.frontsystems.baladas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListViewBalada linhaCustom[] = new CustomListViewBalada[]{
                new CustomListViewBalada(R.drawable.ic_launcher,"Nome Balada","Endereco / telefone"),
                new CustomListViewBalada(R.drawable.ic_launcher,"Nome Balada","Endereco / telefone"),
                new CustomListViewBalada(R.drawable.ic_launcher,"Nome Balada","Endereco / telefone"),
                new CustomListViewBalada(R.drawable.ic_launcher,"Nome Balada","Endereco / telefone")
        };

        CustomListViewBaladaAdapter adapter = new CustomListViewBaladaAdapter(this,R.layout.listview_item_row,linhaCustom);

        ListView list = (ListView) findViewById(R.id.listaBaladas);
        list.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
