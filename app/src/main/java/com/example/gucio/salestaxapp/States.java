package com.example.gucio.salestaxapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class States {
    public HashMap<String, BigDecimal> statesList;

    States (){
        addStates();
    }
    public void addStates() {

        statesList = new HashMap<String, BigDecimal>();

        statesList.put("Alabama", new BigDecimal(4));
        statesList.put("Alaska", new BigDecimal(0));
        statesList.put("Arizona", new BigDecimal(5.6));
        statesList.put("Arkansas", new BigDecimal(6.5));
        statesList.put("California", new BigDecimal(7.25));
        statesList.put("Colorado", new BigDecimal(2.9));
        statesList.put("Connecticut", new BigDecimal(6.35));
        statesList.put("Delaware", new BigDecimal(0));
        statesList.put("Puerto Rico", new BigDecimal(10.5));
        statesList.put("Tennessee", new BigDecimal(7));
        statesList.put("Illinois",new BigDecimal(6.25));
        statesList.put("Utah",new BigDecimal(5.95));
        statesList.put("Virginia",new BigDecimal(5.3));
        statesList.put("Louisiana",new BigDecimal(5));
        statesList.put("North Carolina",new BigDecimal(4.75));
        statesList.put("Missouri",new BigDecimal(4.225));
        statesList.put("Georgia",new BigDecimal(4));
        statesList.put("Indiana",new BigDecimal(7));
        statesList.put("Rhode Island",new BigDecimal(7));
        statesList.put("Minnesota",new BigDecimal(6.875));
        statesList.put("Washington",new BigDecimal(6.5));
        statesList.put("Massachusetts",new BigDecimal(6.25));
        statesList.put("Florida",new BigDecimal(6));
        statesList.put("South Carolina",new BigDecimal(6));
        statesList.put("Vermont",new BigDecimal(6));
        statesList.put("District of Columbia",new BigDecimal(5.75));
        statesList.put("Maine",new BigDecimal(5.5));
        statesList.put("Nebraska",new BigDecimal(5.5));
        statesList.put("New Hampshire",new BigDecimal(0));
        statesList.put("Hawai",new BigDecimal(3.7));

    }
}
