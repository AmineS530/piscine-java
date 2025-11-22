class HouseBuilder implements HousingBuilder {
    private final House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder setSize(int size) {
        this.house.setSize(size);
        return this;
    }

    @Override
    public HouseBuilder setPrice(int price) {
        this.house.setPrice(price);
        return this;
    }

    @Override
    public HouseBuilder setRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

    @Override
    public HouseBuilder setName(String name) {
        this.house.setName(name);
        return this;
    }

    @Override
    public Housing build() {
        return this.house;
    }
}