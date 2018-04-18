package com.example.gucio.salestaxapp;

import java.math.BigDecimal;


public class TaxCalculation {

    private BigDecimal baseCost = new BigDecimal(10);
    private BigDecimal generalCost = new BigDecimal(12.155);
    private BigDecimal profitMargin;

    public BigDecimal marginCalculation(BigDecimal tax)
    {
        tax = tax.divide(new BigDecimal(100),2,BigDecimal.ROUND_CEILING);
        System.out.println(tax);
        baseCost = baseCost.add(baseCost.multiply(tax));
        System.out.println(baseCost);
        profitMargin = generalCost.subtract(baseCost);
        profitMargin = profitMargin.divide(new BigDecimal(1),4,BigDecimal.ROUND_CEILING);

        return profitMargin.stripTrailingZeros();
    }
}
