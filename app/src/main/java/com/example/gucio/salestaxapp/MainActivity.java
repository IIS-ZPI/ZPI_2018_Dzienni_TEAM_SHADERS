package com.example.gucio.salestaxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView taxValue, productCategory;
    private ExpandableListView state;
    private EditText income;
    SpinnerAdapter spinnerAdapter;
    Spinner expListView;
    String choosenState;
    String category = "";
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    TaxCalculation taxCalculation = new TaxCalculation();
    private States states = new States();
    ProducktCategory productCat = new ProducktCategory();

    private void setupApp() {
        taxValue = findViewById(R.id.TaxValue);
        // state = findViewById(R.id.State);
        // income = findViewById(R.id.TaxValue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spiner2 = (Spinner) findViewById(R.id.spinner2);

        taxValue = (TextView) findViewById(R.id.TaxValue);
        productCategory = (TextView) findViewById(R.id.ProductCategory);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        spiner2.setOnItemSelectedListener(this);

        states = new States();
        productCat = new ProducktCategory();

        // Spinner Drop down elements

        List<String> listOfStates = new ArrayList<String>(states.statesList.keySet());
        List<String> listOfProducts = new ArrayList<String>();
        listOfProducts.add("Groceries");
        listOfProducts.add("PreparedFood");
        listOfProducts.add("Presception Drugs");
        listOfProducts.add("NonPresception Drugs");
        listOfProducts.add("Clothing");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listOfStates);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listOfProducts);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spiner2.setAdapter(dataAdapter2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();

        Spinner spinner = (Spinner) parent;
        if (spinner.getId() == R.id.spinner) {
            choosenState = item;
            // Showing selected spinner item

            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

            switch (category) {
                case "Groceries":
                    if (productCat.checkGroceries(choosenState) != null) {
                        productCategory.setText(productCat.groceries.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "PreparedFood":
                    if (productCat.checkPreparedFood(choosenState) != null) {
                        productCategory.setText(productCat.preparedFood.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "Presception Drugs":
                    if (productCat.checkPresciptionDrugs(choosenState) != null) {
                        productCategory.setText(productCat.presciptionDrugs.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "NonPresception Drugs":
                    if (productCat.checkNonPresciptionDrugs(choosenState) != null) {
                        productCategory.setText(productCat.nonPresciptionDrugs.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
            }


        }
        if (spinner.getId() == R.id.spinner2) {

            switch (item) {
                case "Groceries":
                    if (productCat.checkGroceries(choosenState) != null) {
                        productCategory.setText(productCat.groceries.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "PreparedFood":
                    if (productCat.checkPreparedFood(choosenState) != null) {
                        productCategory.setText(productCat.preparedFood.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "Presception Drugs":
                    if (productCat.checkPresciptionDrugs(choosenState) != null) {
                        productCategory.setText(productCat.presciptionDrugs.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
                case "NonPresception Drugs":
                    if (productCat.checkNonPresciptionDrugs(choosenState) != null) {
                        productCategory.setText(productCat.nonPresciptionDrugs.get(choosenState).toString());
                    } else {
                        productCategory.setText("Not avaliabe");
                    }
                    break;
            }

            category = item;
        }


        taxValue.setText(taxCalculation.marginCalculation(choosenState, category).toString());

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}