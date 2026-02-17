public class Main {
    public static void main(String[] args) {
        Player player = new Player("Cleo", 3, 3, 100, 2);
        Monster monster = new Monster("Creeper", 5, 5, 50, 2, "Green");

        System.out.println(" - ROUND 1 -");
        System.out.println(monster.MakeNoise());

        System.out.println("Moster attacked first! Health player -30");
        player.TakeDamage(30); 
        System.out.println(" ");
        System.out.println("Player retaliate the monster! Health Monster -20");
        monster.TakeDamage(20);
        System.out.println(" ");
        System.out.println("The monster attacked with full force! Health player -70");
        player.TakeDamage(70);
        player.OnKilled();
        System.out.println(" ");

        System.out.println(" - ROUND 2 -");
        System.out.println(monster.MakeNoise());
        System.out.println("Player attacked first! Health monster -15");
        monster.TakeDamage(15);
        System.out.println(" "); 
        System.out.println("Player attacked again, double kill! Health monster -20");
        monster.TakeDamage(20);
        player.scoring();
        System.out.println("----- MONSTER DEFEAT -----");

        System.out.println(" ");
        System.out.println(" - CONDITION IF PLAYER DEFEAT - ");
        System.out.println("Monster atacked 100 damage!");
        player.TakeDamage(100);
        System.out.println("----- GAME ENDED -----");
    }
}
