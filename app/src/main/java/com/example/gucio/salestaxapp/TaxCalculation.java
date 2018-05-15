package com.example.gucio.salestaxapp;

import java.math.BigDecimal;


class TaxCalculation {

    private BigDecimal baseCost = new BigDecimal(10);
    private BigDecimal generalCost = new BigDecimal(12.155);
    private States states = new States();

    BigDecimal marginCalculation(String stateName)
    {
        BigDecimal tax = states.statesList.get(stateName);

        tax = tax.divide(new BigDecimal(100),2,BigDecimal.ROUND_CEILING);
        System.out.println(tax);
        baseCost = baseCost.add(baseCost.multiply(tax));
        System.out.println(baseCost);
        BigDecimal profitMargin = generalCost.subtract(baseCost);
        profitMargin = profitMargin.divide(new BigDecimal(1),4,BigDecimal.ROUND_CEILING);

        return profitMargin.stripTrailingZeros();
    }
}
