package concurrence.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        List<String> words =  new LinkedList<>();
//
//        words.add("A");
//        words.add("B");
//        words.add("C");
//        words.add("D");
//        words.add("E");
//
//
//        words.forEach(word -> new ThreadWord(word).start());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            int num = 0, num2 = 0;

            if(0 <= num && num <= 20)
                num = Integer.parseInt(linha);

        }


//        num = Integer.parseInt(strs[0]);
//        num2 = Integer.parseInt(strs[1]);
//
//        int fat = 1;
//        int fat2 = 1;
//
//        for(int i = 1; i <= num; i++){
//            fat *= i;
//        }
//
//        for(int i = 1; i <= num2; i++){
//            fat2 *= i;
//        }
//        System.out.printf("%d%n", fat + fat2);


    }
}
