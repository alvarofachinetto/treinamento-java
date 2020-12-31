package concurrence;

public interface Buffer {
    public void blockingPut(int value) throws InterruptedException;
    // retorna o valor int a partir do Buffer
    public int blockingGet() throws InterruptedException;
}
