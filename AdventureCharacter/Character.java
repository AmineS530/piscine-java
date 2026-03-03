public class Character {
    private final int maxHealth;
    int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
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

    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character opponent) {
        int damage = 9;
        opponent.takeDamage(damage);
    }

    @Override
    public String toString() {
        return currentHealth == 0 ? name + " : KO" : name + " : " + currentHealth + "/" + maxHealth;

    }
}
