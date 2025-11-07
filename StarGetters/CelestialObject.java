
public class CelestialObject {

    public double x;
    public double z;
    public double y;
    public String name;

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

}
