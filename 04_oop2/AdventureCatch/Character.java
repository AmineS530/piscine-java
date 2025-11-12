
import java.util.List;

public abstract class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;
    private static List<Character> allCharacters = new java.util.ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        weapon = null;
        allCharacters.add(this);
    }

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
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

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return currentHealth == 0 ? name + " : KO" : name + " : " + currentHealth + "/" + maxHealth;
    }

    public abstract void takeDamage(int damage) throws DeadCharacterException;

    protected void setCurrentHealth(int health) {
        currentHealth = health;
    }

    public abstract void attack(Character opponent) throws DeadCharacterException;

    public static String printStatus() {
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

    private static boolean safeAttack(Character attacker, Character defender) {
        try {
            attacker.attack(defender);
            return defender.getCurrentHealth() > 0;
        } catch (DeadCharacterException e) {
            e.getMessage();
            return false; // defender is already "dead" scenario — stop the fight
        }
    }

    public static Character fight(Character c1, Character c2) {

        while (c1.getCurrentHealth() > 0 && c2.getCurrentHealth() > 0) {
            if (!safeAttack(c1, c2)) {
                break;
            }
            if (!safeAttack(c2, c1)) {
                break;
            }

        }
        return c1.getCurrentHealth() > 0 ? c1 : c2;
    }
}
