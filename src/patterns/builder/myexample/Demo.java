package patterns.builder.myexample;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        ContaBuilder contaBuilder = new ContaBuilder();

        contaBuilder.titular(new Titular("Alvaro", "123.457.988-12"));
        contaBuilder.cricao(LocalDate.of(2020,04,16));
        contaBuilder.saldo(5.000);
        
        System.out.println(contaBuilder.getResult());
    }
}
