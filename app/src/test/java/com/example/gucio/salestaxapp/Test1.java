package com.example.gucio.salestaxapp;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class Test1 {

    TaxCalculation taxCalculation = new TaxCalculation();
    ProducktCategory producktCategory = new ProducktCategory();
    Scanner scanner = new Scanner(System.in);

    @Test
    public void correctTaxCalculation() throws Exception {

        BigDecimal test;
        BigDecimal num = new BigDecimal(4);
        test = taxCalculation.marginCalculation(num.toString());
        System.out.print(test);
        assertEquals(BigDecimal.valueOf(1.7550), test);
    }

    @Test
    public void checkTestGroceries() {
        String state = "Tennessee";
        producktCategory.setGroceries();
        BigDecimal test = producktCategory.checkGroceries(state);
        assertEquals(BigDecimal.valueOf(0.05),test);

        System.out.print(state);
    }
}