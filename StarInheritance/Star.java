
public class Star extends CelestialObject {

    private double magnitude;

    public Star() {
        super();
        magnitude = 0;
    }

    public Star(String newname, double newx, double newy, double newz, double newmagnitude) {
        super(newname, newx, newy, newz);
        magnitude = 0;
    }

    public double getMagnitude() {
        return magnitude;
    }
}
