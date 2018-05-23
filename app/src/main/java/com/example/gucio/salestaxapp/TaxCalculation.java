package com.example.gucio.salestaxapp;

import java.math.BigDecimal;


class TaxCalculation {

    private BigDecimal baseCost = new BigDecimal(10);
    private BigDecimal generalCost = new BigDecimal(12.485);
    private ProducktCategory producktCategory = new ProducktCategory();
    private States states = new States();

    public BigDecimal marginCalculation(String stateName)
    {
        baseCost = new BigDecimal(10);
        generalCost = new BigDecimal(12.485);

        BigDecimal tax = states.statesList.get(stateName);

        if(producktCategory.checkGroceries(stateName) != null){
            tax = producktCategory.checkGroceries(stateName);
            }else if (producktCategory.checkIntangibles(stateName) != null){
                    tax = producktCategory.checkIntangibles(stateName);
                }else if (producktCategory.checkNonPresciptionDrugs(stateName) !=null){
                        tax = producktCategory.checkNonPresciptionDrugs(stateName);
                    }else if (producktCategory.checkPresciptionDrugs(stateName) != null){
                            tax = producktCategory.checkPresciptionDrugs(stateName);
                        }else if (producktCategory.checkPreparedFood(stateName) != null){
                                tax = producktCategory.checkPreparedFood(stateName);
        }

        tax = tax.divide(new BigDecimal(100),2,BigDecimal.ROUND_CEILING);
        //System.out.println(tax);
        baseCost = baseCost.add(baseCost.multiply(tax));
        //System.out.println(baseCost);
        BigDecimal profitMargin = generalCost.subtract(baseCost);
        profitMargin = profitMargin.divide(new BigDecimal(1),4,BigDecimal.ROUND_CEILING);

        return profitMargin.stripTrailingZeros();
    }
}
