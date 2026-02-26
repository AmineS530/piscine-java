
import java.util.Objects;

public class CelestialObject {

    public double x;
    public double z;
    public double y;
    public String name;
    private int mass;
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        name = "Soleil";
        mass = 0;
        x = 0;
        z = 0;
        y = 0;
    }

    public CelestialObject(String newname, double newx, double newy, double newz, int newmass) {
        x = newx;
        y = newy;
        z = newz;
        name = newname;
        mass = newmass;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public void setX(double newx) {
        x = newx;
    }

    public void setY(double newy) {
        y = newy;
    }

    public void setZ(double newz) {
        z = newz;
    }

    public void setName(String newname) {
        name = newname;
    }

    public void setMass(int newmass) {
        mass = newmass;
    }

    public static double getDistanceBetween(CelestialObject co1, CelestialObject co2) {
        double deltaX = co2.x - co1.x;
        double deltaY = co2.y - co1.y;
        double deltaZ = co2.z - co1.z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    public static double getDistanceBetweenInKm(CelestialObject co1, CelestialObject co2) {
        return getDistanceBetween(co1, co2) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return name + " is positioned at (" + String.format("%.3f", x) + ", " + String.format("%.3f", y) + ", " + String.format("%.3f", z) + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CelestialObject other = (CelestialObject) obj;
        return Double.compare(x, other.x) == 0
                && Double.compare(y, other.y) == 0
                && Double.compare(z, other.z) == 0
                && this.name.equals(other.name)
                && this.mass == other.mass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, x, y, z);
    }

}
