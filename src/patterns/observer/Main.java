package patterns.observer;
import java.io.*;
import java.util.*;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();

        double a = 3.14159 * Math.pow(r, 2);

        System.out.println("A="+a);
    }

}