package com.example.gucio.salestaxapp;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class Test1 {

    TaxCalculation taxCalculation = new TaxCalculation();

    @Test
    public void addition_isCorrect() throws Exception {

        BigDecimal test;
        test = taxCalculation.marginCalculation(BigDecimal.valueOf(4));
        System.out.print(test);
        assertSame(-37.8450000000000006394884621840901672840118408203125, test);
    }
}