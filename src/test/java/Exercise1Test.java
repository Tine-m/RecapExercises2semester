import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

  Exercise1 ex1;

  @BeforeEach
  public void setup() {
    ex1 = new Exercise1();
  }

  @Test
  public void twoIsEven() {
    assertTrue(ex1.isEven(2));
  }

  @Test
  public void zeroIsEven() {
    assertTrue(ex1.isEven(0));
  }

  @Test
  public void elevenIsOdd() {
    assertFalse(ex1.isEven(11));
  }
}