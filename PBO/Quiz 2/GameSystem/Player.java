public class Player extends DamageableObject {
    private int score;
    private int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    @Override
    public void OnKilled() {
        livesRemaining--;
        System.out.println(name + " has been killed! Lives remaining: " + livesRemaining);
        if (livesRemaining <= 0) {
            System.out.println("Game Over for " + name + "!");
        }
    }

    @Override // adding new method with override, so the player can still play if the livesremaining not 0 (reset health if livesremaining > 0)
    public void TakeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health now: " + health);

        if (IsDead()) {
            OnKilled(); 

            if (livesRemaining <= 0) {
                Despawn(); // gameover
            } else {
                // reset health
                health = maxHealth;
                System.out.println(name + " respawned with full health!");
            }
        }
    }

    public void scoring(){ // adding new method, so the score atribut is useable
        if (livesRemaining > 3) {
            score = 1000;
            System.out.println("Score : " + score);
        } else {
            score = 450;  
            System.out.println("Score : " + score);      
        }
    }
}
