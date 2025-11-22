import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public HexaBaseObserver() {
        events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        String binaryString = Integer.toHexString(state);
        events.add(binaryString);
    }

    @Override
    public List<String> getEvents() {
        return events;
    }
}