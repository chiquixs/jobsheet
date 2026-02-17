public abstract class DamageableObject extends GameObject {
    protected int maxHealth;
    protected int health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public boolean IsDead() {
        return health <= 0;
    }

    public void TakeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health now: " + health);
        if (IsDead()) {
            OnKilled(); 
            Despawn();
        }
    }

    public abstract void OnKilled(); 
}
