public class Exercise4 {

  // Exchange bad word with nicer word
  public String exchangeBadword(String text) {
    String censuredText=text;
    if (text.contains("sgu")) {
      censuredText = text.replaceAll("sgu", "sandelig");
    }
    else if (text.contains("fandeme")) {
      censuredText = text.replaceAll("fandeme", "sandelig");
    }
    else if (text.contains("kraftedme")) {
      censuredText = text.replaceAll("kraftedme", "sandelig");
    }

    return censuredText;
  }

}
