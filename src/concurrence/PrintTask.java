package concurrence;

import java.security.SecureRandom;

public class PrintTask implements Runnable{

    private static final SecureRandom generator = new SecureRandom();
    private final Integer sleepTime;
    private final String taskName;

    public PrintTask(String taskName){
        this.taskName = taskName;

        sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
        try // coloca a thread para dormir pela quantidade de tempo sleepTime
        {
            System.out.printf("%s going to sleep for %d milliseconds.%n",
                    taskName, sleepTime);
            Thread.sleep(sleepTime); // coloca a thread para dormir
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); // reinterrompe a thread
        }

        // imprime o nome da tarefa
        System.out.printf("%s done sleeping%n", taskName);
    }
}
