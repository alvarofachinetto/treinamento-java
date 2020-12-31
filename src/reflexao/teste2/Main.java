package reflexao.teste2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
//        Object goat = new Goat();
//
//        Class<?> clazz = Class.forName("reflexao.teste2.Goat"); //obtém a classe

//        System.out.println(clazz.getSimpleName() == "Goat" ? true : false); //verifica se o nome da classe realmente existe
//        System.out.println(clazz.getName() == "reflexao.teste2.Goat" ? true : false); //verifica se a classe pertence a determinado pacote
//        System.out.println(clazz.getCanonicalName() == "reflexao.teste2.Goat" ? true : false); //verifica se a classe pertence a determinado pacote
//
//        int goatModes = clazz.getModifiers();
//
//        Package pacoteDaClasse = clazz.getPackage();

//        if(!Modifier.isPublic(goatModes)) //verifica o nível de acessibilidade da classe
//            throw new Exception("Class is not public");
//        System.out.println("O pacote em que a classe está é " + pacoteDaClasse + " seu otário");

//        Class superClass = clazz.getSuperclass(); //obtém as superclass
//        Class interfaceOfClass[] = clazz.getInterfaces(); //obtém as interface
//
//        System.out.println(superClass.getSimpleName());
//        System.out.println(interfaceOfClass[0].getSimpleName());

//        Constructor<?>[] constructors = clazz.getConstructors();
//
//        System.out.println(constructors[0].getName());
//
//        Field[] fields = clazz.getFields();

//        System.out.println(fields[0].getDeclaringClass());
//
//        Method[] methods = clazz.getMethods();
//
//        System.out.println(methods[0].getName());

        Class<?> goat = Class.forName("reflexao.teste2.Goat");

        Field field = goat.getField("SOUND");
        field.setAccessible(true);

        System.out.println(field.get(null));


//        Method[] methods = goatClass.getMethods();
//
//        List listMethods = Arrays.asList(methods);
//
//        listMethods.forEach(method -> System.out.println(method));

//        Goat goat1 = new Goat();
//        Method locomotionMethod = goat.getClass().getDeclaredMethod("getName");
//        System.out.println(locomotionMethod.canAccess(goat));

//        Class<?> goatClass = Class.forName("reflexao.teste2.Goat");
//        Goat goat1 = (Goat) goatClass.getConstructor().newInstance();
//        Method setNameMethod = goat1.getClass().getDeclaredMethod("setName", String.class);
//        Method getNameMethod = goat1.getClass().getDeclaredMethod("getName");
//        String name = (String) getNameMethod.invoke(goat1);
//
//        System.out.println(name);
//        System.out.println(goat1.getName());
//
//        setNameMethod.invoke(name, "Olá");
//
//        String name1 = (String) getNameMethod.invoke(goat1);
//        System.out.println(name1);
//        System.out.println(goat1.getName());


    }
}
