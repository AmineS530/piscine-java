import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate.isEmpty()) {
            return null;
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
                .appendPattern("EEEE d MMMM yyyy").toFormatter();
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate.isEmpty()) {
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