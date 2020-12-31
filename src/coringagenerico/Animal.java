package coringagenerico;

public class Animal {

    private String nome;

    private Double peso;

    public Animal(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }
}
