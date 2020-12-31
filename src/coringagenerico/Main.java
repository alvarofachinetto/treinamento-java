package coringagenerico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<Gato>();

        gatos.add(new Gato("Vira lata", 12.0));
        gatos.add(new Gato("Persa", 15.0));
        gatos.add(new Gato("Maine Coon", 20.0));
        gatos.add(new Gato("Siamês", 11.0));
        gatos.add(new Gato("Balinês", 12.0));

        List<Cachorro> cachorros = new ArrayList<>();

        cachorros.add(new Cachorro("Beagle", 13.0));
        cachorros.add(new Cachorro("Galgo Inglês", 13.0));
        cachorros.add(new Cachorro("Maltês", 08.0));
        cachorros.add(new Cachorro("São Bernado", 25.0));

        double total = sumPesoAnimals(cachorros);
        total += sumPesoAnimals(gatos);

        System.out.printf("%f", total);

    }

    public static double sumPesoAnimals(List<? extends Animal> animals){
        if(!animals.isEmpty())
            return animals.stream()
                        .mapToDouble(Animal::getPeso)
                        .reduce(0, (a, b) -> a + b);

        throw new IllegalArgumentException("Sum fails!!");
    }

}
