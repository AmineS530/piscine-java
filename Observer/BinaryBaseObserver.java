import java.util.ArrayList;
import java.util.List;

public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public BinaryBaseObserver() {
        events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        String binaryString = Integer.toBinaryString(state);
        events.add(binaryString);
    }

    @Override
    public List<String> getEvents() {
        return events;
    }
}
