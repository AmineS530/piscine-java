
public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return currentHealth == 0 ? name + " : KO" : name + " : " + currentHealth + "/" + maxHealth;
    }

    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character opponent) {
        int damage = 9;
        // this would be fun
        // int critChance = 20;
        // if (Math.random() * 100 < critChance) {
        //     damage *= 2;
        // }
        opponent.takeDamage(damage);
    }

}
