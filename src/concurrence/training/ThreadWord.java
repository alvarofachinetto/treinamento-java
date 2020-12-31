package concurrence.training;

public class ThreadWord extends Thread{

    private String word;

    public ThreadWord(String word) {
        this.word = word;
    }

    @Override
    public void run() {

        System.out.println(word);

        super.run();
    }
}
