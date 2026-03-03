
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0 ? this.getName() + " is a monster and is dead"
                : this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
    }
}
