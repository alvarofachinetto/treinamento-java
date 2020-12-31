package reflexao.teste2;

public abstract class Animal implements Eating{
    public static String STRATEGY = "domestic";
    private String name;

    protected abstract String sound();
}
