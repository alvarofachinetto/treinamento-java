//package generics.exercicio1;
//
//import java.util.Comparator;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
//        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
//
//
//    }
//
//    public static <T> void printArray(T[] inputArray)
//    {
//        // exibe elementos do array
//        for (T element : inputArray)
//            System.out.printf("%s ", element);
//        System.out.println();
//    }
//
//    public static void printArray(T[] inputArray, Integer[] lowSubscript, Integer[] highSubscript)
//    {
//        // exibe elementos do array
//        for (Integer element : lowSubscript){
//            if (element instanceof Integer)
//                System.out.printf("%s ", element);
//            throw new InvalidSubscriptException("Elemento inválido");
//        }
//
//
//        for (Integer element : highSubscript){
//            if (element instanceof Integer)
//                System.out.printf("%s ", element);
//            throw new InvalidSubscriptException("Elemento inválido");
//        }
//
//        System.out.println();
//    }
//
////    public <T extends Comparable<T>> selectionSort(T [] numeros){
////
////        for (int i=0; i< numeros.length; i++){
////
////        }
////        return;
////    }
//}
