
public class Templar extends Character implements Healer, Tank {

    private final int shield;
    private final int healCapacity;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
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
    public void takeDamage(int damage) {
        int effectiveDamage = damage - this.shield;
        if (effectiveDamage < 0) {
            effectiveDamage = 0;
        }
        this.setHealth(Math.max(this.getCurrentHealth() - effectiveDamage, 0));
    }

    @Override
    public void attack(Character opponent) {
        this.heal(this);
        int damage = 6;
        opponent.takeDamage(damage);
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0 ? this.getName() + " has been beaten, even with its " + this.getShield() + " shield. So bad, it could heal " + this.healCapacity + " HP."
                : this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP and has a shield of " + this.shield + ".";
    }
}
