
public class CelestialObject {

    public double x;
    public double z;
    public double y;
    public String name;

    public CelestialObject(String newname, double newx, double newy, double newz) {
        x = newx;
        y = newy;
        z = newz;
        name = newname;
    }

    public CelestialObject() {
        x = 0;
        z = 0;
        y = 0;
        name = "Soleil";
    }
}
