import java.util.ArrayList;

public class Exercise6 {

  public int findUniqueColors(ArrayList<String> colors) {
    ArrayList<String> results = new ArrayList<>();

    for (int i = 0; i < colors.size(); i++) {
      if (!results.contains(colors.get(i))) {
        results.add(colors.get(i));
      }
    }
    return results.size();
  }
}
