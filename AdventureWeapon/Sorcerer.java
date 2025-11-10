
public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) {
        if (character.getCurrentHealth() == 0) {
            return;
        }
        int newHealth = Math.min(character.getCurrentHealth() + this.healCapacity, character.getMaxHealth());
        character.setCurrentHealth(newHealth);
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void takeDamage(int damage) {
        int effectiveDamage = damage;
        this.setCurrentHealth(Math.max(this.getCurrentHealth() - effectiveDamage, 0));
    }

    @Override
    public void attack(Character opponent) {
        this.heal(this);
        Weapon currWeapon = this.getWeapon();
        int damage = currWeapon != null ? currWeapon.getDamage() : 10;
        opponent.takeDamage(damage);
    }

    @Override
    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append(this.getCurrentHealth() == 0 ? this.getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP."
                : this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP.");
        Weapon currWeapon = this.getWeapon();
        if (currWeapon != null) {
            status.append(" He has the weapon ").append(currWeapon.getName()).append(" deals ").append(currWeapon.getDamage())
                    .append(" damages.");
        }
        return status.toString();
    }

}
