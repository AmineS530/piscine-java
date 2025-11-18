
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        String[] parts = stringDate.split(" ");
        int monthEnum = Month.valueOf(parts[2].toUpperCase(Locale.ENGLISH)).getValue();
        parts[2] = String.valueOf(monthEnum);
        stringDate = parts[1] + " " + parts[2] + " " + parts[3];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M yyyy", Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        String[] numbers = stringDate.split("\\D+");
        if (numbers.length != 3) {
            return null;
        }

        int hour = Integer.parseInt(numbers[0]);
        int minute = Integer.parseInt(numbers[1]);
        int second = Integer.parseInt(numbers[2]);
        boolean isMorning = stringDate.contains("morning");
        if (!isMorning) {
            if (hour != 12) {
                hour += 12;
            }
        } else {
            if (hour == 12) {
                hour = 0;
            }
        }
        return LocalTime.of(hour, minute, second);
    }

}
