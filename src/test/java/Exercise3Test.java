import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

  Exercise3 ex3;

  @BeforeEach
  public void setup() {
    ex3 = new Exercise3();
  }

  @Test
  public void itIsFriday() {
    boolean actual = ex3.isItFriday(LocalDate.parse("2023-02-03"));
    assertTrue(actual);
  }

  @Test
  public void itIsNotFriday() {
    boolean actual = ex3.isItFriday(LocalDate.parse("2023-02-02"));
    assertFalse(actual);
  }

  @Test
  public void itIsNotAValidDate() {
    assertThrows(DateTimeParseException.class, () -> {
      ex3.isItFriday(LocalDate.parse("2023-02-31"));
    });
  }

}