public class Exercise5 {

  public int letterCount(char letter, String text) {

    if (letter >= 'A' && letter <= 'Z') {
      letter = Character.toLowerCase(letter);
    }
    String lowerCase = text.toLowerCase();
    int counter = 0;
    for (int i = 0; i < lowerCase.length() ; i++) {
      if (lowerCase.charAt(i) == letter)  {
        counter++;
      }
    }
    return counter;
  }

}
