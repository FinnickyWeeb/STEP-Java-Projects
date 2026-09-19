package Week7AssignmentProblems;

class CharacterHealthAssignment {
    private int health;
    private final int maxHealth;

    CharacterHealthAssignment(int maxHealth) {
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;

        if (health < 0)
            health = 0;
    }

    public void heal(int amount) {
        health += amount;

        if (health > maxHealth)
            health = maxHealth;
    }

    public int getHealth() {
        return health;
    }
}

public class Week7A1Health {
    public static void main(String[] args) {
        CharacterHealthAssignment c =
                new CharacterHealthAssignment(100);

        c.takeDamage(30);
        System.out.println("Health: " + c.getHealth());

        c.heal(50);
        System.out.println("Health: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("Health: " + c.getHealth());
    }
}