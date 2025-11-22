
public class TransportFactory {

    public Transport getTransport(String Type) {
        if (Type.equals("Car")) {
            return new Car();
        } else if (Type.equals("Plane")) {
            return new Plane();
        }
        return null;
    }
}
