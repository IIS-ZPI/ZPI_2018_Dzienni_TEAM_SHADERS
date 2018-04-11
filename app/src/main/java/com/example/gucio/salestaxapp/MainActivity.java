package com.example.gucio.salestaxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView taxValue;
    private ExpandableListView state;
    private EditText income;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    private void setupApp()
    {
        taxValue = findViewById(R.id.TaxValue);
        state = findViewById(R.id.State);
        income = findViewById(R.id.Income);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupApp();
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.State);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData()
    {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("States");

        // Adding child data

        List<String> state = new ArrayList<String>();
        state.add("Alabama");
        state.add("Georgia");
        state.add("Indiana");
        state.add("Louisiana");
        state.add("Nebraska");

        listDataChild.put(listDataHeader.get(0), state); // Header, Child data

    }
}
