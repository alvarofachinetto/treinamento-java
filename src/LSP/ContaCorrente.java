package LSP;

public class ContaCorrente {

    private final ServicoGerenciadorDeConta servicoGerenciadorDeConta;

    public ContaCorrente(ServicoGerenciadorDeConta servicoGerenciadorDeConta){
        this.servicoGerenciadorDeConta = servicoGerenciadorDeConta;
    }

    public double verSaldo(){
        return this.servicoGerenciadorDeConta.verSaldo();
    }

    public double deposita(double valor){
        return this.servicoGerenciadorDeConta.deposita(valor);
    }

    public double saca(double valor){
        return this.servicoGerenciadorDeConta.saca(valor);
    }

    public double rende(double taxa){
        return this.servicoGerenciadorDeConta.rende(taxa);
    }



}
