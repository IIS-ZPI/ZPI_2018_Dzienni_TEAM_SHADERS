package com.example.gucio.salestaxapp;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class TaxCalculation {

    private BigDecimal baseCost = new BigDecimal(10);
    private BigDecimal generalCost = new BigDecimal(12.155);
    private BigDecimal profitMargin;

    public BigDecimal marginCalculation(BigDecimal tax)
    {

        baseCost = baseCost.add(baseCost.multiply(tax));
        profitMargin = generalCost.subtract(baseCost);
        return profitMargin;
    }
}
