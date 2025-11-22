public abstract class RacletteDecorator implements Raclette {
    Raclette decoratedRaclette;

    @Override
    public int getCalories() {
        return this.decoratedRaclette.getCalories();
    }

    @Override
    public String getIngredients() {
        return this.decoratedRaclette.getIngredients();
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}