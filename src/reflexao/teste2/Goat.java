package reflexao.teste2;

public class Goat extends Animal implements Locomotion{

    public String name;
    private String habitat;

    public static String SOUND = "BEEEEEE";

    public Goat() {
    }

    public Goat(String habitat) {
        this.habitat = habitat;
    }

    public Goat(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public static String getSOUND() {
        return SOUND;
    }

    public static void setSOUND(String SOUND) {
        Goat.SOUND = SOUND;
    }

    @Override
    public String getLocomotion() {
        return "walks";
    }

    @Override
    protected String sound() {
        return "bleat";
    }

    @Override
    public String eats() {
        return "grass";
    }
}
