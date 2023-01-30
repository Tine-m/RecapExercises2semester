import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

  Exercise6 ex6;

  @BeforeEach
  public void setup() {
    ex6 = new Exercise6();
  }

  @Test
  public void findOneUniqueColor() {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("red"));
    int result = ex6.findUniqueColors(colors);
    assertTrue(result == 1);
  }

  @Test
  public void findOneUniqueColorInListWithDuplicates() {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "red"));
    int result = ex6.findUniqueColors(colors);
    assertTrue(result == 1);
  }

  @Test
  public void findFourUniqueColorsInListWithMoreColors() {
    ArrayList<String> colors =
        new ArrayList<>(Arrays.asList("red", "green", "red", "red", "green", "blue", "blue", "yellow"));
    int result = ex6.findUniqueColors(colors);
    assertTrue(result == 4);
  }

  @Test
  public void findNoUniqueColorsInEmptyList() {
    ArrayList<String> colors = new ArrayList<>();
    int result = ex6.findUniqueColors(colors);
    assertTrue(result == 0);
  }

}