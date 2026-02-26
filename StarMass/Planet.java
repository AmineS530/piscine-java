
import java.util.Objects;

public class Planet extends CelestialObject {

    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star newStar, int newmass) {
        super(name, x, y, z, newmass);
        this.centerStar = newStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Planet other = (Planet) obj;
        return Double.compare(x, other.x) == 0
                && Double.compare(y, other.y) == 0
                && Double.compare(z, other.z) == 0
                && this.name.equals(other.name)
                && this.centerStar.equals(other.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, centerStar);
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", this.name, this.centerStar.getName(), getDistanceBetween(this, centerStar));
    }
}
