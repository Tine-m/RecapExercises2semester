import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

  Exercise5 ex5;

  @BeforeEach
  public void setup() {
    ex5 = new Exercise5();
  }
  @Test
  public void noLettersFound() {
    int actual = ex5.letterCount('a', "hej med dig");
    assertEquals(0, actual);
  }

  @Test
  public void oneLetterFound() {
    int actual = ex5.letterCount('h', "hej med dig");
    assertEquals(1, actual);
  }

  @Test
  public void twoLettersFound() {
    int actual = ex5.letterCount('e', "hej med dig");
    assertEquals(2, actual);
  }

  @Test
  public void oneLetterFoundCaseIgnored() {
    int actual = ex5.letterCount('h', "Hej med dig");
    assertEquals(1, actual);
  }

  @Test
  public void oneLetterFoundCaseIgnored2() {
    int actual = ex5.letterCount('H', "hej med dig");
    assertEquals(1, actual);
  }
}