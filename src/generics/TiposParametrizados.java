package generics;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TiposParametrizados {

    public static void main(String[] args) {

        List<Animal> pilhaDeAnimais = new ArrayList<>();

        pilhaDeAnimais.add(new Animal("Cachorro", "Casa"));
        pilhaDeAnimais.add(new Animal("Pato", "Lagoa"));
        pilhaDeAnimais.add(new Animal("Gato", "Casa"));
        pilhaDeAnimais.add(new Animal("Coelho", "Mato"));
        pilhaDeAnimais.add(new Animal("Porco", "Chiqueiro"));
        pilhaDeAnimais.add(new Animal("Capivara", "Mato"));
        pilhaDeAnimais.add(new Animal("Vaca", "Fazenda"));

        pilhaDeAnimais.forEach(animal ->{
            printAnimal(animalsPorHabitat(animal));
        });


    }


    public static List<Animal> animalsPorHabitat(Animal animal){

        Stack<Animal> pilhaDeAnimaisPorHabitat = new Stack<>();

        pilhaDeAnimaisPorHabitat.push(animal);

        return pilhaDeAnimaisPorHabitat.stream()
                .filter(animalQue -> animalQue.getHabitat().equals("Casa"))
                .collect(Collectors.toList());

    }

    public static void printAnimal(List<Animal> pilhaDeAnimais){
         pilhaDeAnimais
                .forEach( animal -> System.out.printf("%s vive em %s %n", animal.getNome(), animal.getHabitat()));
    }
}
