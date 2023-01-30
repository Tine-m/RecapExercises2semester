import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

  Exercise4 ex4;

  @BeforeEach
  public void setup() {
    ex4 = new Exercise4();
  }

  @Test
  public void removeNoWords() {
    String actual = ex4.exchangeBadword("Det er godt");
    assertEquals("Det er godt", actual);
  }

  @Test
  public void removeSgu() {
    String actual = ex4.exchangeBadword("Det er sgu ikke godt");
    assertEquals("Det er sandelig ikke godt", actual);
  }

  @Test
  public void removeFandeme() {
    String actual = ex4.exchangeBadword("Det er fandeme ikke godt");
    assertEquals("Det er sandelig ikke godt", actual);
  }

  @Test
  public void removeKraftedme() {
    String actual = ex4.exchangeBadword("Det er kraftedme ikke godt");
    assertEquals("Det er sandelig ikke godt", actual);
  }
}