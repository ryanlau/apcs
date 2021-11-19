public class Monster {
    private int health = 100;
    private int baseAttackDamage = 10;
    private int attackVariation = 2;

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage) {
        health = health - damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int attack(Protagonist p) {
        int attackDamage = (int) (Math.random() * 2 * attackVariation) + baseAttackDamage - attackVariation;

        if (p.getSpecialized()) {
            p.loseHealth(attackDamage * p.getSpecializedMultiplier());
            return attackDamage * p.getSpecializedMultiplier();
        }

        p.loseHealth(attackDamage);
        return attackDamage;
    }
}
