package generics;

public class Main {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // passa um array de Integers
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // passa um array Doubles
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // passa um array de Characters
    }

    public static void printArray(Object[] inputArray){
        for(Object array: inputArray){
            System.out.printf("%s ", array);
        }
        System.out.println("");
    }
}
