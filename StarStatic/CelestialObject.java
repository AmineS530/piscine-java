
public class CelestialObject {

    public double x;
    public double z;
    public double y;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        x = 0;
        z = 0;
        y = 0;
        name = "Soleil";
    }

    public CelestialObject(String newname, double newx, double newy, double newz) {
        x = newx;
        y = newy;
        z = newz;
        name = newname;
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
}
