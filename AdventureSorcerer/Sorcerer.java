
public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) {
        if (character.getCurrentHealth() == 0) {
            return;
        }
        int newHealth = Math.min(character.getCurrentHealth() + this.healCapacity, character.getMaxHealth());
        character.setHealth(newHealth);
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0 ? this.getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP"
                : this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP";
    }

}
