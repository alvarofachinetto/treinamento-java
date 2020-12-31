package generics.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            if(s1.length() > 15){
                s1 = s1.substring(0, 15);
            }
            System.out.printf("%s\t\t%03d\n", s1,x);

        }
        System.out.println("================================");

//        scan.nextLine()
//
////        String s1 = new String();
//        String s2 = new String();
//
//        Integer i1 = 0;
//
//
//        boolean result = isEqualTo(i1, s2);

    }

    public static <T> boolean isEqualTo(T arg1, T arg2){
        if(arg1.equals(arg2))
            return true;

        return false;
    }
}
