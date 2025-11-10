
public class Templar extends Character implements Healer, Tank {

    private final int shield;
    private final int healCapacity;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        if (character.getCurrentHealth() == 0) {
            throw new DeadCharacterException(character);
        } else if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int newHealth = Math.min(character.getCurrentHealth() + this.healCapacity, character.getMaxHealth());
        character.setCurrentHealth(newHealth);
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }

        int effectiveDamage = damage - this.shield;
        if (effectiveDamage < 0) {
            effectiveDamage = 0;
        }
        this.setCurrentHealth(Math.max(this.getCurrentHealth() - effectiveDamage, 0));
    }

    @Override
    public void attack(Character opponent) throws DeadCharacterException {
        if (opponent.getCurrentHealth() == 0) {
            throw new DeadCharacterException(opponent);
        }
        this.heal(this);
        Weapon currWeapon = this.getWeapon();
        int damage = currWeapon != null ? currWeapon.getDamage() : 10;
        opponent.takeDamage(damage);
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append(this.getCurrentHealth() == 0 ? this.getName() + " has been beaten, even with its " + this.getShield() + " shield. So bad, it could heal " + this.healCapacity + " HP."
                : this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP and has a shield of " + this.shield + ".");
        Weapon currWeapon = this.getWeapon();
        if (currWeapon != null) {
            status.append(" He has the weapon ").append(currWeapon.getName()).append(" deals ").append(currWeapon.getDamage())
                    .append(" damages.");
        }
        return status.toString();
    }
}
