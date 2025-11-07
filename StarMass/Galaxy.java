
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObjects) {
        this.celestialObjects.add(celestialObjects);
    }

    public Map computeMassRepartition() {
        Map<String, Integer> Masses = new HashMap<>();
        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                Masses.merge("Star", obj.getMass(), Integer::sum);
            } else if (obj instanceof Planet) {
                Masses.merge("Planet", obj.getMass(), Integer::sum);
            } else {
                Masses.merge("Other", obj.getMass(), Integer::sum);
            }
        }
        return Masses;
    }
}
