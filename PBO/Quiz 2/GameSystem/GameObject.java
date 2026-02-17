public class GameObject {
    public String name;
    public int posX;
    public int posY;

    public GameObject(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public void Despawn(){
        System.out.println(name + " has been removed from the game world.");
    }
}
