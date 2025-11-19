
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }

        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM", Locale.FRENCH);
        String monthText = monthFormatter.format(dateTime);

        return String.format("Le %d %s de l'an %d à %dh%dm et %ds",
                dateTime.getDayOfMonth(),
                monthText,
                dateTime.getYear(),
                dateTime.getHour(),
                dateTime.getMinute(),
                dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }

        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM", Locale.ITALIAN);
        String monthText = monthFormatter.format(date);

        return String.format("%s %d %d",
                monthText,
                date.getDayOfMonth(),
                date.getYear());
    }

    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        return String.format("%02d:%02d:%02d.%d",
                time.getHour(),
                time.getMinute(),
                time.getSecond(),
                time.getNano());
    }

}
