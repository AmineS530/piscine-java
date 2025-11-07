
import java.util.Objects;

public class Star extends CelestialObject {

    private double magnitude;

    public Star() {
        super();
        magnitude = 0;
    }

    public Star(String newname, double newx, double newy, double newz, double newmagnitude, int newmass) {
        super(newname, newx, newy, newz, newmass);
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
        return Double.compare(x, other.x) == 0
                && Double.compare(y, other.y) == 0
                && Double.compare(z, other.z) == 0
                && this.name.equals(other.name)
                && Double.compare(magnitude, other.magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, x, y, z, magnitude);
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", name, magnitude);
    }
}
