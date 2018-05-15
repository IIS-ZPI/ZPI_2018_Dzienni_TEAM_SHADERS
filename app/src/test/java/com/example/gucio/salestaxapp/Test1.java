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
    private States states = new States();

    @Test
    public void correctTaxCalculation() {
        BigDecimal test = taxCalculation.marginCalculation("Alabama");
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
    @Test
    public void checkTestPreparedFood() {
        String state = "Indiana";
        producktCategory.setPreparedFood();
        BigDecimal test = producktCategory.checkPreparedFood(state);
        assertEquals(BigDecimal.valueOf(0.09),test);

        System.out.print(state);
    }

    @Test
    public void checkTestPresciptionDrugs() {
        String state = "Illinois";
        producktCategory.setPresciptionDrugs();
        BigDecimal test = producktCategory.checkPresciptionDrugs(state);
        assertEquals(BigDecimal.valueOf(0.01),test);

        System.out.print(state);
    }

    @Test
    public void checkTestNonPresciptionDrugs() {
        String state = "Illinois";
        producktCategory.setNonPresciptionDrugs();
        BigDecimal test = producktCategory.checkNonPresciptionDrugs(state);
        assertEquals(BigDecimal.valueOf(0.01),test);

        System.out.print(state);
    }

    @Test
    public void checkTestIntangibles() {
        String state = "Connecticut";
        producktCategory.setIntangibles();
        BigDecimal test = producktCategory.checkIntangibles(state);
        assertEquals(BigDecimal.valueOf(0.01),test);

        System.out.print(state);
    }
}

