package concurrence;

public class ArrayWriter implements Runnable{

    private final SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array)
    {
        startValue = value;
        sharedSimpleArray = array;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue + 3; i++)
        {
            try {
                sharedSimpleArray.add(i); // adiciona um elemento ao array compartilhado
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static interface Buffer {

        public void blockingPut(int value) throws InterruptedException;

        public void blockingGet() throws InterruptedException;
    }
}
