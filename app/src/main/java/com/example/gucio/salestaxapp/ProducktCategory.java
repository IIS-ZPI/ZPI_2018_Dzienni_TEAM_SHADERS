package com.example.gucio.salestaxapp;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
        groceries.put("Puerto Rico",new BigDecimal(0.01).setScale(2,RoundingMode.DOWN));
        groceries.put("Tennessee",new BigDecimal(0.05).setScale(2,RoundingMode.DOWN));
        groceries.put("Arkansas",new BigDecimal(0.015).setScale(2,RoundingMode.DOWN));
        groceries.put("Illinois",new BigDecimal(0.01).setScale(2,RoundingMode.DOWN));
        groceries.put("Utah",new BigDecimal(0.03).setScale(2,RoundingMode.DOWN));
        groceries.put("Virginia",new BigDecimal(0.025).setScale(2,RoundingMode.DOWN));
        groceries.put("Louisiana",new BigDecimal(0.07).setScale(2,RoundingMode.DOWN));
        groceries.put("North Carolina",new BigDecimal(0.02).setScale(2,RoundingMode.DOWN));
        groceries.put("Missouri",new BigDecimal(0.01225).setScale(2,RoundingMode.DOWN));
        groceries.put("Georgia",new BigDecimal(0.04).setScale(2,RoundingMode.DOWN));

    }

    public void setPreparedFood()
    {
        preparedFood.put("Indiana",new BigDecimal(0.09).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Rhode Island",new BigDecimal(0.08).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Minnesota",new BigDecimal(0.10775).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Washington",new BigDecimal(0.1).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Illinois",new BigDecimal(0.0825).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Massachusetts",new BigDecimal(0.07).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Florida",new BigDecimal(0.09).setScale(2,RoundingMode.DOWN));
        preparedFood.put("South Carolina",new BigDecimal(0.105).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Vermont",new BigDecimal(0.09).setScale(2,RoundingMode.DOWN));
        preparedFood.put("District of Columbia",new BigDecimal(0.1).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Maine",new BigDecimal(0.08).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Nebraska",new BigDecimal(0.095).setScale(2,RoundingMode.DOWN));
        preparedFood.put("Virginia",new BigDecimal(0.053).setScale(2,RoundingMode.DOWN));
        preparedFood.put("North Carolina",new BigDecimal(0.085).setScale(2,RoundingMode.DOWN));
        preparedFood.put("New Hampshire",new BigDecimal(0.09).setScale(2,RoundingMode.DOWN));
    }

    public void setPresciptionDrugs()
    {
        presciptionDrugs.put("Illinois",new BigDecimal(0.01).setScale(2,RoundingMode.DOWN));
    }

    public void setNonPresciptionDrugs()
    {
        nonPresciptionDrugs.put("Illinois",new BigDecimal(0.01).setScale(2,RoundingMode.DOWN));
    }

    public void setClothing()
    {

    }

    public void setIntangibles()
    {
        intangibles.put("Connecticut",new BigDecimal(0.01).setScale(2,RoundingMode.DOWN));
    }

    public BigDecimal checkGroceries (String state)
    {
        if(groceries.containsKey(state)){
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
