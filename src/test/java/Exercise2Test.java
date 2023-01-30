import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

  Exercise2 ex2;

  @BeforeEach
  public void setup() {
    ex2 = new Exercise2();
  }

  @Test
  public void calculateIntegerValue() {
    double actual = ex2.salesTaxCalculation(10);
    assertEquals(12.5, actual);
  }

  @Test
  public void calculateValueThatNeedsArounding() {
    double actual = ex2.salesTaxCalculation(10.75);
    assertEquals(13.44, actual);
  }

  @Test
  public void calculateValueThatNeedsArounding2() {
    double actual = ex2.salesTaxCalculation(4.01);
    assertEquals(5.01, actual);
  }
  @Test
  public void calculateValueWithMoreDecimalsThatNeedsArounding() {
    double actual = ex2.salesTaxCalculation(266.775);
    assertEquals(333.47, actual);
  }

  @Test
  public void calculateZero() {
    double actual = ex2.salesTaxCalculation(0);
    assertEquals(0, actual);
  }

  @Test
  public void calculateFailsDueToInvalidValue() {
    assertThrows(IllegalArgumentException.class, () -> {
      ex2.salesTaxCalculation(-10);
    });
  }

}