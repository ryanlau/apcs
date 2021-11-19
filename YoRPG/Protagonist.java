public class Protagonist {
    private String name;
    private int health = 500;
    private boolean specialized = false;
    private int specializedMultiplier = 2;
    private int baseAttackDamage = 15;
    private int attackVariation = 3;

    public Protagonist(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void specialize() {
        specialized = true;
    }

    public void normalize() {
        specialized = false;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean getSpecialized() {
        return specialized;
    }

    public int getSpecializedMultiplier() {
        return specializedMultiplier;
    }

    public void loseHealth(int damage) {
        health = health - damage;
    }

    public int attack(Monster m) {
        int attackDamage = (int) (Math.random() * 2 * attackVariation) + baseAttackDamage - attackVariation;

        if (specialized) {
            m.loseHealth(attackDamage * specializedMultiplier);
            return attackDamage * specializedMultiplier;
        }

        m.loseHealth(attackDamage);
        return attackDamage;
    }
}
