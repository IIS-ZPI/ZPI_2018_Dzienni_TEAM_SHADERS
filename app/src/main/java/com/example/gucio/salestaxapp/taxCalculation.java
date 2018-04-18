import java.math.BigDecimal;


public class taxCalculation {

    private BigDecimal baseCost = new BigDecimal(10);
    private BigDecimal generalCost = new BigDecimal(12.155);
    private BigDecimal profitMargin;

    public BigDecimal marginCalculation(BigDecimal tax)
    {
        tax = tax.divide(new BigDecimal(100),BigDecimal.ROUND_CEILING);
        baseCost = baseCost.add(baseCost.multiply(tax));
        profitMargin = generalCost.subtract(baseCost);

        return profitMargin;
    }
}
