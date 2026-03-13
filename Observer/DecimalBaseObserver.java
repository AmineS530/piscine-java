import java.util.ArrayList;
import java.util.List;

public class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state) {
        String decimalString = Integer.toString(state);
        events.add(decimalString);
    }

    @Override
    public List<String> getEvents() {
        return events;
    }
}