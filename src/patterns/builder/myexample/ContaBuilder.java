package patterns.builder.myexample;

import java.time.LocalDate;

public class ContaBuilder implements Builder{

    private Titular titular;
    private LocalDate criacao;
    private double saldo;

    @Override
    public void titular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public void cricao(LocalDate criacao) {
        this.criacao = criacao;
    }

    @Override
    public void saldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta getResult(){
        return new Conta(titular, criacao, saldo);
    }
}
