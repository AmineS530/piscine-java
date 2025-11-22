public class ApartmentBuilder implements HousingBuilder {
    private final Apartment apartment;

    public ApartmentBuilder() {
        this.apartment = new Apartment();
    }

    @Override
    public ApartmentBuilder setSize(int size) {
        this.apartment.setSize(size);
        return this;
    }

    @Override
    public ApartmentBuilder setPrice(int price) {
        this.apartment.setPrice(price);
        return this;
    }

    @Override
    public ApartmentBuilder setRooms(int rooms) {
        this.apartment.setRooms(rooms);
        return this;
    }

    @Override
    public ApartmentBuilder setName(String name) {
        this.apartment.setName(name);
        return this;
    }

    @Override
    public Housing build() {
        return this.apartment;
    }
}
