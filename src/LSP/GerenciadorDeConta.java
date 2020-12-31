package LSP;

public class GerenciadorDeConta implements ServicoGerenciadorDeConta{

    private double saldo;

    public double verSaldo(){
        return this.saldo;
    }

    public double deposita(double valor){
        return this.saldo +=  valor;
    }

    public double saca(double valor){
        if (this.saldo < valor)
            throw new IllegalArgumentException("Saldo insuficiente");

        return this.saldo -= valor;
    }

    public double rende(double taxa){
        return this.saldo += this.saldo * taxa;
    }


}
