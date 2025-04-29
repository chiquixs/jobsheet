public class StackKonversi18{
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi18(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }
}