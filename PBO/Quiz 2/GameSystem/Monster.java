public class Monster extends DamageableObject {
    private int threatLevel;
    private String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String MakeNoise() {
        return name + " : RAWWRRRR!";
    }

    @Override
    public void OnKilled() {
        System.out.println(name + " with color " + color + " (Level " + threatLevel + ") has been defeated!");
    }
}
