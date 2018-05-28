package com.example.gucio.salestaxapp;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class ProducktCategory {

    private States states;
     HashMap<String, BigDecimal> groceries = new HashMap<>();
     HashMap<String, BigDecimal> preparedFood =new HashMap<>();
     HashMap<String, BigDecimal> presciptionDrugs =new HashMap<>();
     HashMap<String, BigDecimal> nonPresciptionDrugs=new HashMap<>();
     HashMap<String, BigDecimal> clothing = new HashMap<>();
     HashMap<String, BigDecimal> intangibles = new HashMap<>();

     public ProducktCategory() {
         setGroceries();
         setPreparedFood();
         setNonPresciptionDrugs();
         setPresciptionDrugs();
         setIntangibles();
     }

    public void setGroceries()
    {
        groceries.put("Puerto Rico",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Tennessee",new BigDecimal(5).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Arkansas",new BigDecimal(1.5).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Illinois",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Utah",new BigDecimal(3).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Virginia",new BigDecimal(2.5).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Louisiana",new BigDecimal(7).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("North Carolina",new BigDecimal(2).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Missouri",new BigDecimal(1.225).setScale(2,RoundingMode.HALF_EVEN));
        groceries.put("Georgia",new BigDecimal(4).setScale(2,RoundingMode.HALF_EVEN));

    }

    public void setPreparedFood()
    {
        preparedFood.put("Indiana",new BigDecimal(9).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Rhode Island",new BigDecimal(8).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Minnesota",new BigDecimal(10.775).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Washington",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Illinois",new BigDecimal(8.25).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Massachusetts",new BigDecimal(7).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Florida",new BigDecimal(9).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("South Carolina",new BigDecimal(10.5).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Vermont",new BigDecimal(9).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("District of Columbia",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Maine",new BigDecimal(8).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Nebraska",new BigDecimal(9.5).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("Virginia",new BigDecimal(5.3).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("North Carolina",new BigDecimal(8.5).setScale(2,RoundingMode.HALF_EVEN));
        preparedFood.put("New Hampshire",new BigDecimal(9).setScale(2,RoundingMode.HALF_EVEN));
    }

    public void setPresciptionDrugs()
    {
        presciptionDrugs.put("Illinois",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
    }

    public void setNonPresciptionDrugs()
    {
        nonPresciptionDrugs.put("Illinois",new BigDecimal(1).setScale(2,RoundingMode.HALF_EVEN));
    }


    public void setIntangibles()
    {
        intangibles.put("Connecticut",new BigDecimal(0.01).setScale(2,RoundingMode.HALF_EVEN));
    }

    public BigDecimal checkGroceries (String state)
    {
        if(groceries.containsKey(state)){
            return groceries.get(state).stripTrailingZeros();
        }else return null;
    }

    public BigDecimal checkPreparedFood (String state)
    {
        if(preparedFood.containsKey(state)){
            return preparedFood.get(state).stripTrailingZeros();
        }else return null;
    }

    public BigDecimal checkPresciptionDrugs (String state)
    {
        if(presciptionDrugs.containsKey(state)){
            return presciptionDrugs.get(state).stripTrailingZeros();
        }else return null;
    }

    public BigDecimal checkNonPresciptionDrugs (String state)
    {
        if(nonPresciptionDrugs.containsKey(state)){
            return nonPresciptionDrugs.get(state).stripTrailingZeros();
        }else return null;
    }

    public BigDecimal checkIntangibles (String state)
    {
        if(intangibles.containsKey(state)){
            return intangibles.get(state).stripTrailingZeros();
        }else return null;
    }


}
