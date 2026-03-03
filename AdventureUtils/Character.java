import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private final static List<Character> allCharacters = new java.util.ArrayList<>();

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
    public static String printStatus( ) {
      StringBuilder status = new StringBuilder();
        if (allCharacters.isEmpty()) {
            return """
                   ------------------------------------------
                   Nobody's fighting right now !
                   ------------------------------------------\n""";
        } else {
            status.append("""
            ------------------------------------------
            Characters currently fighting :\n""");
        }
        for (Character character : allCharacters) {
            status.append(" - ").append(character.toString()).append("\n");
        }
        status.append("------------------------------------------\n");
        return status.toString();
    }
    public static Character fight(Character c1, Character c2) {
        while (c1.getCurrentHealth() > 0 && c2.getCurrentHealth() > 0) {
            c1.attack(c2);
            if (c2.getCurrentHealth() > 0) {
                c2.attack(c1);
            }
        }
        return c1.getCurrentHealth() > 0 ? c1 : c2;
    }

    @Override
    public String toString() {
        return currentHealth == 0 ? name + " : KO" : name + " : " + currentHealth + "/" + maxHealth;

    }
}
