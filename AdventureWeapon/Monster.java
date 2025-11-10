
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append(this.getCurrentHealth() == 0 ? this.getName() + " is a monster and is dead"
                : this.getName() + " is a monster with " + this.getCurrentHealth() + " HP");
        Weapon currWeapon = this.getWeapon();
        if (currWeapon != null) {
            status.append(" He has the weapon ").append(currWeapon.getName()).append(" deals ").append(currWeapon.getDamage())
                    .append(" damages.");
        }

        return status.toString();
    }

    @Override
    public void takeDamage(int damage) {
        int effectiveDamage = (int) Math.round(damage * 0.8);
        this.setCurrentHealth(Math.max(this.getCurrentHealth() - effectiveDamage, 0));
    }

    @Override
    public void attack(Character opponent) {
        int damage = 7;
        opponent.takeDamage(damage);
    }
}
