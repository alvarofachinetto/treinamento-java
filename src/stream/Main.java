package stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    String name;
    BigDecimal salary;
    String department;

    public Employee(String name, BigDecimal salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee("Alvaro", new BigDecimal(15000), "Product"),
                        new Employee("Bianca", new BigDecimal(18000), "Boss"),
                        new Employee("Natasha", new BigDecimal(10000), "Market")
                )
        );

//        System.out.println(employees.stream()
//                                .flatMap(Collection::stream)
//                                .collect(Collectors.toList()));
    }

}
