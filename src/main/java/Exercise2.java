import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise2 {

  public double salesTaxCalculation(double productPrice) {
    if (productPrice < 0) {
      throw new IllegalArgumentException("Invalid product price");
    }
    double salesTax = productPrice * 0.25;
    double priceWithTax =  productPrice + salesTax;
    BigDecimal bd = new BigDecimal(Double.toString(priceWithTax));
    bd = bd.setScale(2, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }
}
