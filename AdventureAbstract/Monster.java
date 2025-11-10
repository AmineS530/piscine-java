
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0 ? this.getName() + " is a monster and is dead"
                : this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
    }

    @Override
    public void takeDamage(int damage) {
        int effectiveDamage = (int) Math.round(damage * 0.8);
        this.setHealth(Math.max(this.getCurrentHealth() - effectiveDamage, 0));
    }

    @Override
    public void attack(Character opponent) {
        int damage = 7;
        opponent.takeDamage(damage);
    }
}
