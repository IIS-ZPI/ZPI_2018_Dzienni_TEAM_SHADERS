package com.example.gucio.salestaxapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;


public class States {
    HashMap<String, BigDecimal> statesList;
    ArrayList<String> stateList;

    public void States() {
        statesList = new HashMap<String, BigDecimal>();

        statesList.put("Alabama", new BigDecimal(4));
        statesList.put("Alaska", new BigDecimal(0));
        statesList.put("Arizona", new BigDecimal(5.6));
        statesList.put("Arkansas", new BigDecimal(6.5));
        statesList.put("California", new BigDecimal(7.25));
        statesList.put("Colorado", new BigDecimal(2.9));
        statesList.put("Connecticut", new BigDecimal(6.35));
        statesList.put("Delaware", new BigDecimal(0));
    }

    public ArrayList<String> getStatesList()
    {
        stateList.add("Alabama");
        stateList.add("Alaska");
        stateList.add("Arizona");
        stateList.add("Arkansas");
        stateList.add("California");
        stateList.add("Colorado");
        stateList.add("Connecticut");
        stateList.add("Delaware");

        return stateList;
    }
}
