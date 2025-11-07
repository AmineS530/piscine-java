
import java.util.Objects;

public class Star extends CelestialObject {

    private double magnitude;

    public Star() {
        super();
        magnitude = 0;
    }

    public Star(String newname, double newx, double newy, double newz, double newmagnitude) {
        super(newname, newx, newy, newz);
        magnitude = newmagnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Star other = (Star) obj;
        return Double.compare(magnitude, other.magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, magnitude);
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", name, magnitude);
    }
}
