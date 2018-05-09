package com.example.gucio.salestaxapp;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class ProducktCategory {

    private States states;
    private HashMap<String, BigDecimal> groceries = new HashMap<>();
    private HashMap<String, BigDecimal> preparedFood =new HashMap<>();
    private HashMap<String, BigDecimal> presciptionDrugs =new HashMap<>();
    private HashMap<String, BigDecimal> nonPresciptionDrugs=new HashMap<>();
    private HashMap<String, BigDecimal> clothing = new HashMap<>();
    private HashMap<String, BigDecimal> intangibles = new HashMap<>();

    public void setGroceries()
    {
        groceries.put("Puerto Rico",new BigDecimal(0.01));
        groceries.put("Tennessee",new BigDecimal(0.05));
        groceries.put("Arkansas",new BigDecimal(0.015));
        groceries.put("Illinois",new BigDecimal(0.01));
        groceries.put("Utah",new BigDecimal(0.03));
        groceries.put("Virginia",new BigDecimal(0.025));
        groceries.put("Louisiana",new BigDecimal(0.07));
        groceries.put("North Carolina",new BigDecimal(0.02));
        groceries.put("Missouri",new BigDecimal(0.01225));
        groceries.put("Georgia",new BigDecimal(0.04));

    }

    public void setPreparedFood()
    {
        preparedFood.put("Indiana",new BigDecimal(0.09));
        preparedFood.put("Rhode Island",new BigDecimal(0.08));
        preparedFood.put("Minnesota",new BigDecimal(0.10775));
        preparedFood.put("Washington",new BigDecimal(0.1));
        preparedFood.put("Illinois",new BigDecimal(0.0825));
        preparedFood.put("Massachusetts",new BigDecimal(0.07));
        preparedFood.put("Florida",new BigDecimal(0.09));
        preparedFood.put("South Carolina",new BigDecimal(0.105));
        preparedFood.put("Vermont",new BigDecimal(0.09));
        preparedFood.put("District of Columbia",new BigDecimal(0.1));
        preparedFood.put("Maine",new BigDecimal(0.08));
        preparedFood.put("Nebraska",new BigDecimal(0.095));
        preparedFood.put("Virginia",new BigDecimal(0.053));
        preparedFood.put("North Carolina",new BigDecimal(0.085));
        preparedFood.put("New Hampshire",new BigDecimal(0.09));
    }

    public void setPresciptionDrugs()
    {
        presciptionDrugs.put("Illinois",new BigDecimal(0.01));
    }

    public void setNonPresciptionDrugs()
    {
        nonPresciptionDrugs.put("Illinois",new BigDecimal(0.01));
    }

    public void setClothing()
    {

    }

    public void setIntangibles()
    {
        intangibles.put("Connecticut",new BigDecimal(0.01));
    }

    public BigDecimal checkGroceries (String state)
    {
        if(groceries.containsValue(state)){
            return groceries.get(state);
        }else return null;
    }

    public BigDecimal checkPreparedFood (String state)
    {
        if(preparedFood.containsKey(state)){
            return preparedFood.get(state);
        }else return null;
    }

    public BigDecimal checkPresciptionDrugs (String state)
    {
        if(presciptionDrugs.containsKey(state)){
            return presciptionDrugs.get(state);
        }else return null;
    }

    public BigDecimal checkNonPresciptionDrugs (String state)
    {
        if(nonPresciptionDrugs.containsKey(state)){
            return nonPresciptionDrugs.get(state);
        }else return null;
    }

    public BigDecimal checkIntangibles (String state)
    {
        if(intangibles.containsKey(state)){
            return intangibles.get(state);
        }else return null;
    }


}
