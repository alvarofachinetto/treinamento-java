package patterns.builder.myexample;

import java.time.LocalDate;

public class Conta {

    private final Titular titular;
    private final LocalDate criacao;
    private final double saldo;

    public Conta(Titular titular, LocalDate criacao, double saldo) {
        this.titular = titular;
        this.criacao = criacao;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", criacao=" + criacao +
                ", saldo=" + saldo +
                '}';
    }
}
