package generics;

public class Animal {
    private String nome;

    private String habitat;

    public Animal(String nome, String habitat) {
        this.nome = nome;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getHabitat() {
        return habitat;
    }
}
