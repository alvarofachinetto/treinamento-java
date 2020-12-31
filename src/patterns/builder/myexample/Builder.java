package patterns.builder.myexample;

import java.time.LocalDate;

public interface Builder {

    void titular(Titular titular);
    void cricao(LocalDate localDate);
    void saldo(double saldo);

}
