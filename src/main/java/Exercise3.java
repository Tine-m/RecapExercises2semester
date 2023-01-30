import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exercise3 {

  public boolean isItFriday(LocalDate date) {
    DayOfWeek day = date.getDayOfWeek();
    if (day.getDisplayName(TextStyle.FULL, Locale.getDefault()).equals("fredag")) {
      return true;
    }
    else return false;
  }
}
