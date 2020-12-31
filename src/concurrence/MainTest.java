package concurrence;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentSkipListSet;

public class MainTest {

    public static void main(String[] args) {
        ConcurrentSkipListSet<String> listSet = new ConcurrentSkipListSet<>();

        listSet.add("B");
        listSet.add("A");
        listSet.add("C");
        listSet.add("D");
        listSet.add("E");

        listSet.parallelStream()
                .filter(letra -> letra.contains("A") || letra.contains("E") || letra.contains("I") ||
                        letra.contains("O") || letra.contains("U"))
                .sorted()
                .forEachOrdered(letra -> System.out.println(letra));



    }
}
