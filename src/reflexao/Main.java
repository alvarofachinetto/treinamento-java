package reflexao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Object person = new Person();

        Field [] fields = person.getClass().getFields();
        List<String> actualFieldsName = getFieldsNames(fields);

        System.out.println(Arrays.asList("name", "age").containsAll(actualFieldsName));
    }

    private static List<String> getFieldsNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for(Field field : fields)
            fieldNames.add(field.getName());

        return fieldNames;
    }
}
