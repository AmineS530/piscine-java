public class WithPickles extends  RacletteDecorator {

    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return this.decoratedRaclette.getCalories() + 50;
    }

    @Override
    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", cornichons";
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}